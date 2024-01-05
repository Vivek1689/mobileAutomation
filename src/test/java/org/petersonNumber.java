package org;

public class petersonNumber {
    public static void main(String[] args){
        int number = 145;
        int temp = number;
        int sum = 0;
        int factorial = 0;
        while(temp>0){
            int digit = temp%10;
            factorial = 1;
            for (int i =2;i<=digit;i++){
                factorial = i*factorial;
            }
            temp = temp/10;
            sum += factorial;
        }
        if(sum==number) System.out.println(number+" is peterson number");
        else System.out.println(number+" is not peterson number");
    }
    //145 = 1!+4!+5! peterson number

}
