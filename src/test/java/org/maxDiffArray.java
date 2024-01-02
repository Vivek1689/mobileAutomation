package org;

public class maxDiffArray {
    public static void main(String[] args){
        int[] a = {1,4,8,15,17};
        int diff = 0;
        for (int i =0;i<a.length-1;i++){
                int tempDiff = Math.abs(a[i]-a[i+1]);
                if(tempDiff>diff){
                    diff = tempDiff;
                }

        }
        System.out.println(diff);
    }
}
