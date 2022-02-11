package br.com.rafael.gof.structural_patterns.facade.ex01.facade_class;

import br.com.rafael.gof.structural_patterns.facade.ex01.framework_classes.VideoFile;
import java.io.File;

/**
 * This class is responsible for going inside the video conversion framework and using
 * its methods and functionalities to provide our application a more convenient and handy
 * way for converting videos (without having to know it in depth).
 */
public class VideoConverter {
    public static File convert(String filename, String format) {
        return new VideoFile(filename.split("\\.")[0] + "." + format.toLowerCase()); //This way just for simplicity's sake.
    }
}
