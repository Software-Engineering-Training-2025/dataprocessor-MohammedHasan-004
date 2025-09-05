package org.example.dataprocessor;
import java.io.IOException;
import java.nio.file.*;
public class textfileoutput implements OutputStrategy {
    private static final Path PATH = Paths.get("target", "result.txt");

    public void write(double value) throws IOException {
        Files.createDirectories(PATH.getParent());
        Files.writeString(PATH, "Result = " + value + System.lineSeparator());
    }
}
