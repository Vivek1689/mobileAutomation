package org;

public class factorial {
    public static void main(String[] args){
        int number = 5;
        int factorial = 1;
        for (int i=2;i<=5;i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }

}
