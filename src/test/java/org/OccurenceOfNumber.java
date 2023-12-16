package org;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OccurenceOfNumber {

    public static void main(String[] args){
        int[] numberArray = {4,5,5,5,4,6,6,9,4};
        HashMap<Integer,Integer> occurenceMapping = new HashMap<>();
        for (int number:numberArray) {
            if(occurenceMapping.containsKey(number)){
                int numberOcuurence = occurenceMapping.get(number);
                numberOcuurence++;
                occurenceMapping.put(number,numberOcuurence);
            }else{
                occurenceMapping.put(number,1);
            }
        }
        for (Map.Entry<Integer, Integer> pairs : occurenceMapping.entrySet()) {
            System.out.println(pairs.getKey()+"-"+pairs.getValue());
            if (pairs.getValue()==1){
                System.out.println(pairs.getKey()+" is unique");
            }
        }

    }
}
