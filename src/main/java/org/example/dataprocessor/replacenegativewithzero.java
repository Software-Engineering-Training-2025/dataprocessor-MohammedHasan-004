package org.example.dataprocessor;

import java.util.ArrayList;
import java.util.List;

public class replacenegativewithzero implements CleaningStrategy {
     public List<Integer> clean(List<Integer> data){
         List<Integer> result2 = new ArrayList<>();
         for(Integer num: data){
             if (num<0){
                 result2.add(0);
             }
             else{
                 result2.add(num);
             }
         }

         return result2;

     }
}
