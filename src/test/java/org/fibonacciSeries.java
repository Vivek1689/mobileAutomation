package org;


import com.google.gson.internal.bind.util.ISO8601Utils;

public class fibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int k;
        System.out.print(a+" "+b+" "); //0 1 1 2 3 5 7
        for (int i=1;i<=5;i++){
            k=a+b;
            System.out.print(k+" ");
            a=b;
            b=k;
        }
    }
}
