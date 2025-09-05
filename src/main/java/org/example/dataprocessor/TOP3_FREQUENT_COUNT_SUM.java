package org.example.dataprocessor;
import java.util.*;
import static java.lang.Double.NaN;
public class TOP3_FREQUENT_COUNT_SUM implements AnalysisStrategy {
    public double analyse(List<Integer> list){
        if (list.isEmpty()) return 0.0;
        Map<Integer,Integer> freq = new HashMap<>();
        for (int x : list) freq.merge(x, 1, Integer::sum);

        // sort by count desc, then value asc
        List<Map.Entry<Integer,Integer>> entries = new ArrayList<>(freq.entrySet());
        entries.sort((e1, e2) -> {
            int c = Integer.compare(e2.getValue(), e1.getValue());
            return (c != 0) ? c : Integer.compare(e1.getKey(), e2.getKey());
        });

        int sum = 0, k = 0;
        for (Map.Entry<Integer,Integer> e : entries) {
            if (k == 3) break;
            sum += e.getValue();
            k++;
        }
        return sum;
    }

}
