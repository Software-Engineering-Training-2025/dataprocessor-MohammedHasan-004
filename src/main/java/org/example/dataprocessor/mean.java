package org.example.dataprocessor;
import java.util.*;
import static java.lang.Double.NaN;
public class mean implements AnalysisStrategy{

    public double analyse(List<Integer> list){
        if (list.isEmpty()) return NaN;
        int sum=0;
        for(Integer i:list){sum+=i;}
        return sum/(double)list.size();
    }
}
