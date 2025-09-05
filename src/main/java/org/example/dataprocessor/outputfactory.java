package org.example.dataprocessor;

import org.example.dataprocessor.enums.OutputType;

public class outputfactory {
    public static OutputStrategy getoutput(OutputType type){
        return switch (type){
            case CONSOLE ->new consoleoutput();
            case TEXT_FILE -> new textfileoutput();
        };
    }
}
