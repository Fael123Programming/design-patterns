package br.com.rafael.gof.structural_patterns.facade.ex01.framework_classes;

public class CodecFactory {
    public static BaseCodec extract(VideoFile videoFile) {
        String extension = videoFile.getName().split("..")[1].toUpperCase();
        if (extension.equals("MP4"))
            return new MPEG4CompressionCodec();
        else if (extension.equals("OGG"))
            return new OggCompressionCodec();
        else
            throw new IllegalArgumentException("video file " + videoFile.getName() + " has an invalid format");
    }
}
