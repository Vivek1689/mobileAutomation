package org;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayMatch {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 7};
        int[] b = {6, 4, 3, 7};
        ArrayList<Integer> matchList = new ArrayList<Integer>();
        for (int i = 0; i < a.length;i++){
            if (a[i]==b[i]){
                matchList.add(a[i]);
            }
        }
        Object[] matchedArray = matchList.toArray();
        System.out.println(Arrays.toString(matchedArray));
    }
}
