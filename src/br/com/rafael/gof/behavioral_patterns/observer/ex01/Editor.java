package br.com.rafael.gof.behavioral_patterns.observer.ex01;

import br.com.rafael.gof.behavioral_patterns.observer.ex01.publisher.EventManager;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Editor {
    public final EventManager eventManager;
    private Path path;

    {
        eventManager = new EventManager();
    }

    public void openFile(String path) throws IOException {
        this.path = Paths.get(path);
        if (Files.notExists(this.path))
            Files.createFile(this.path);
        eventManager.notify("open", this.path.getFileName().toString());
    }

    public void saveFile() throws IOException {
        FileWriter writer = new FileWriter(this.path.toFile());
//        writer.write();
        writer.flush();
        writer.close();
        eventManager.notify("save", this.path.getFileName().toString());
    }
}
