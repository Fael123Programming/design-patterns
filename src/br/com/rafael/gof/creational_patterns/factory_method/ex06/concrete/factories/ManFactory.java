package br.com.rafael.gof.creational_patterns.factory_method.ex06.concrete.factories;

import br.com.rafael.gof.creational_patterns.factory_method.ex06.concrete.person.Person;
import br.com.rafael.gof.creational_patterns.factory_method.ex06.enums.Gender;
import br.com.rafael.gof.creational_patterns.factory_method.ex06.abstract_.*;

public class ManFactory implements PersonFactory {
    @Override
    public IPerson createPerson() {
        Person man = new Person();
        man.setGender(Gender.MALE);
        return man;
    }
}
