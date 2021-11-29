package br.com.rafael.gof.structural_patterns.bridge.ex03.test;

import br.com.rafael.gof.structural_patterns.bridge.ex03.concrete_classes.devices.*;
import br.com.rafael.gof.structural_patterns.bridge.ex03.concrete_classes.remote_controls.*;

public class Test {
    public static void main(String[] args) {
//        This represents the client code...
        TV tv = new TV();
        Remote control = new Remote(tv);
        control.togglePower();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                control.channelUp();
            control.volumeUp();
        }
        System.out.println(tv.getChannel() + "\t" + tv.getVolume());
        control = new AdvancedRemote(new Radio());
        control.togglePower();
        ((AdvancedRemote) control).callPresidentOfUSA();
        control.togglePower();
        (new Remote(tv)).togglePower();
//        We can switch implementations at runtime!!!
//        In this sense, it is similar to Strategy!
    }
}
