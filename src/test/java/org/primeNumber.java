package org;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inputNumber= Integer.parseInt((sc.nextLine()));
        if (!isPrime(inputNumber)){
            System.out.println(inputNumber+" "+"is Prime number");
        }else{
            System.out.println(inputNumber+" "+"is not a Prime number");
        }
    }

    public static boolean isPrime(int inputNumber){
        boolean flag = false;
        if(inputNumber==0 || inputNumber ==1){
            return flag;
        }
        for(int i=2;i<=Math.sqrt(inputNumber);i++){
            if(inputNumber%i==0){
                flag = true;
                return flag;
            }
        }
        return flag;
    }
}
