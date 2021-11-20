package br.com.rafael.gof.creational_patterns.factory_method.ex06.concrete.factories;

import br.com.rafael.gof.creational_patterns.factory_method.ex06.abstract_.IPerson;
import br.com.rafael.gof.creational_patterns.factory_method.ex06.abstract_.PersonFactory;
import br.com.rafael.gof.creational_patterns.factory_method.ex06.concrete.person.Person;
import br.com.rafael.gof.creational_patterns.factory_method.ex06.enums.Gender;

public class WomanFactory implements PersonFactory {
    @Override
    public IPerson createPerson() {
        Person woman = new Person();
        woman.setGender(Gender.FEMALE);
        return woman;
    }
}
