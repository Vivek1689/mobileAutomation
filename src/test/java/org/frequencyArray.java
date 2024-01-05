package org;

import java.util.ArrayList;

public class frequencyArray {
    public static void main(String[] args){
        int[] numbers= {1, 2, 8, 3, 2, 2, 2, 5, 1 };
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i=0;i<numbers.length;i++) {
            int k = 0;
            if (!numberList.contains(numbers[i])) {
                numberList.add(numbers[i]);
                k++;
                for (int j=i+1;j<numbers.length;j++){
                    if (numbers[j]==numbers[i]){
                        k++;
                    }
                }
                System.out.println(numbers[i]+" repeated "+k+" times");
                if (k==1){
                    System.out.println(numbers[i]+"is unique");
                }
            }

        }
    }
}
