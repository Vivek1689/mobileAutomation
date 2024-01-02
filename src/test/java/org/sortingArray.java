package org;

import java.util.Arrays;

public class sortingArray {
    public static void main(String[] args){
        int[] a = {2,6,1,4,9};
        System.out.println(Arrays.toString(ascending(a)));
       System.out.println(Arrays.toString(descending(a)));
    }
    public static int[] ascending(int[] a){
        int temp = 0;
        for (int i =0;i<a.length-1;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[j]<a[i]){
                   temp = a[i];
                   a[i] = a[j];
                   a[j] = temp;
                }
            }
        }
        return a;
    }

    public static int[] descending(int[] a){
        int temp;
        for (int i =0;i<a.length-1;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[j]>a[i]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
    }

