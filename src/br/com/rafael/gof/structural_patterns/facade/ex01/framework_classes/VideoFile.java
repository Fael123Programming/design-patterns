package br.com.rafael.gof.structural_patterns.facade.ex01.framework_classes;

import java.io.File;

public class VideoFile extends File {
//  We do not maintain these classes because they are third-party software...
    public VideoFile(String pathname) {
        super(pathname);
    }
}
