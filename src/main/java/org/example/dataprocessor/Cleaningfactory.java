package org.example.dataprocessor;

import org.example.dataprocessor.enums.CleaningType;

public class Cleaningfactory {
    public static CleaningStrategy getcleaningtype(CleaningType clean){
        return switch (clean){
            case REMOVE_NEGATIVES ->  new removenegative();
            case REPLACE_NEGATIVES_WITH_ZERO ->   new replacenegativewithzero();
        };
    }
}
