package org.example.dataprocessor;
import java.util.*;
import static java.lang.Double.NaN;
public class P90_NEAREST_RANK implements AnalysisStrategy{

    public double analyse(List<Integer> list){
        if (list.isEmpty()) return NaN;
        List<Integer> a = new ArrayList<>(list);
        Collections.sort(a);
        int n = a.size();
        int rank = (int) Math.ceil(0.90 * n); // 1-based
        rank = Math.max(1, Math.min(rank, n));
        return (double)a.get(rank - 1);
    }
}
