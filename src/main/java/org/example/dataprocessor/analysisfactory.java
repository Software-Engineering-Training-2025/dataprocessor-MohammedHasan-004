package org.example.dataprocessor;

import org.example.dataprocessor.enums.AnalysisType;

public class analysisfactory {
    public static AnalysisStrategy getanlysis(AnalysisType analysis){
        return switch (analysis){
            case MEAN->new mean();
            case MEDIAN->new median();
            case STD_DEV->new standarddeviasion();
            case P90_NEAREST_RANK->new P90_NEAREST_RANK();
            case TOP3_FREQUENT_COUNT_SUM->new TOP3_FREQUENT_COUNT_SUM();
        };
    }
}
