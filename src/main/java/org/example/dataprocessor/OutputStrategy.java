package org.example.dataprocessor;

import java.util.List;

public interface OutputStrategy {
    void write(double value)throws Exception;
}
