package org.example.dataprocessor;

public class consoleoutput implements OutputStrategy {
    public void write(double value) {
        System.out.println("Result = " + value);
    }
}
