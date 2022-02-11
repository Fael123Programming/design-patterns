package br.com.rafael.gof.structural_patterns.decorator.ex03.concrete.components;

import br.com.rafael.gof.structural_patterns.decorator.ex03.abstract_.component.DataSource;
import java.io.*;
import java.util.Scanner;

public class FileDataSource implements DataSource {
    private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
        this.assertFileCreation();
    }

    @Override
    public void writeData(String data) {
        this.assertFileCreation();
        try (PrintStream ps = new PrintStream(this.filename)) {
            ps.println(data);
        } catch(FileNotFoundException ignore) { /*Never going to happen*/}
    }

    @Override
    public String readData() {
        this.assertFileCreation();
        StringBuilder data = new StringBuilder();
        try (Scanner reader = new Scanner(new File(this.filename))) {
            while (reader.hasNext())
                data.append(reader.nextLine());
        } catch(FileNotFoundException ignore) { /*Never going to happen*/}
        return data.toString();
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    private void assertFileCreation() {
        try {
            new File(this.filename).createNewFile();
        } catch(IOException ignore) {
            System.out.println("An IOException has been thrown\n.Try changing the name of the file");
        }
    }
}
