package br.com.rafael.gof.behavioral_patterns.observer.ex01.subscriber;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.time.LocalDateTime;

public class LoggingListener implements EventListener { //Concrete subscriber!
    private final Path log;
    private final String message;

    public LoggingListener(String logFilename, String message) throws IOException {
        log = Paths.get(logFilename);
        if (Files.notExists(log)) {
            Files.createFile(log);
            FileWriter writer = new FileWriter(log.toFile());
            writer.write("Log file created at (" + LocalDateTime.now() + ")");
            writer.flush();
            writer.close();
        }
        this.message = message;
    }

    @Override
    public void update(String filename) throws IOException {
        FileWriter writer = new FileWriter(log.toFile(), true);
        writer.write("\n" + message + ": " + filename + " (" + LocalDateTime.now() + ")");
        writer.flush();
        writer.close();
    }
}
