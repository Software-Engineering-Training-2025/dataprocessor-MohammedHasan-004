package org.example.dataprocessor;
import java.util.*;
import static java.lang.Double.NaN;
public class standarddeviasion implements AnalysisStrategy{
    public double analyse(List<Integer> list){
        if (list.isEmpty()) return NaN;
        double mean = new mean().analyse(list);
        double sumSq = 0.0;
        for (int x : list) {
            double d = x - mean;
            sumSq += d * d;
        }
        return Math.sqrt(sumSq / list.size());
    }

}
