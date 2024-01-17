package org;

import java.util.Arrays;
import java.util.Collections;

public class thirdLargestNumber {
    public static void main(String[] args) {
        Integer[] array = {5,4,7,8,4,6,3};
        Arrays.sort(array,Collections.reverseOrder());
        System.out.println(array[2]);
    }
}
