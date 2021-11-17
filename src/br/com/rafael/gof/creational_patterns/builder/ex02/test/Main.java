package br.com.rafael.gof.creational_patterns.builder.ex02.test;

import br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.builders.CarBuilder;
import br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.builders.ManualBuilder;
import br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.car.Car;
import br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.director.Director;
import br.com.rafael.gof.creational_patterns.builder.ex02.concrete_classes.manual.Manual;
import br.com.rafael.gof.creational_patterns.builder.ex02.interfaces.Builder;

//Using the Builder pattern makes sense only when your products
//are quite complex and require extensive configuration.
//This pattern refrains us of defining large constructor methods
//delegating the process of object creation to a director class
//which uses a builder class to perform it and to contain the final result.
//Even though we have used here a director class to coordinate it, you may
//want to build your products your way, so you can handle the builder
//directly and call its methods as you want. Finally, do not forget to get
//your result from the very same builder.
//Your products may have different features installed or enabled!!!

public class Main {
    // The client code creates a builder object, passes it to the
    // director and then initiates the construction process. The end
    // result is retrieved from the builder object.
    public static void main(String[] args) {
        Builder builder = new CarBuilder();
        Director director = new Director();
        director.makeSUV(builder);
        Car suv = ((CarBuilder) builder).getResult();
        // The final product is often retrieved from a builder
        // object since the director isn't aware of and not
        // dependent on concrete builders and products.
        director.makeSportCar(builder);
        Car sportCar = ((CarBuilder) builder).getResult();
        builder = new ManualBuilder();
        director.makeSUV(builder);
        Manual suvManual = ((ManualBuilder) builder).getResult();
        director.makeSportCar(builder);
        Manual sportCarManual = ((ManualBuilder) builder).getResult();
        System.out.println(suv);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(suvManual);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(sportCar);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(sportCarManual);
    }
}
