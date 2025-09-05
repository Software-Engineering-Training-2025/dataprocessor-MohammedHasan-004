package org.example.dataprocessor;
import java.util.*;
public class removenegative implements CleaningStrategy {
    public List<Integer> clean(List<Integer> data){
    List<Integer> result = new ArrayList<>();
    for (Integer num : data) {
        if (num > 0) {
            result.add(num);
        }
    }
    return result;

}}
