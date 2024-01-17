package org;

import java.util.Arrays;

public class arrayRightRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int temp = array[(array.length)-1];
        for (int i = array.length-1; i>=1; i--) {
            array[i] = array[i -1];
        }
        array[0]=temp;
        System.out.println(Arrays.toString(array));
    }
}
