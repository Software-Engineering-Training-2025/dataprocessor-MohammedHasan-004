package org.example.dataprocessor;
import java.util.*;
import static java.lang.Double.NaN;
public class median implements AnalysisStrategy{
    public double analyse(List<Integer> list){
        if (list.isEmpty()) return NaN;
        List<Integer> a = new ArrayList<>(list);
        Collections.sort(a);
        int n = a.size();
        if ((n & 1) == 1) return a.get(n/2);
        return (a.get(n/2 - 1) + a.get(n/2)) / 2.0;
    }
}
