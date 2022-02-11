package br.com.rafael.gof.structural_patterns.facade.ex01.application;

import br.com.rafael.gof.structural_patterns.facade.ex01.facade_class.VideoConverter;
import br.com.rafael.gof.structural_patterns.facade.ex01.framework_classes.VideoFile;
import java.io.File;

public class Application {
    public static void main(String[] args) {
        File old = new VideoFile("my_birthday_party.ogg");
        File newOne = VideoConverter.convert(old.getName(), "mp4");
        System.out.println(old.getName());
        System.out.println(newOne.getName());
    }
}
