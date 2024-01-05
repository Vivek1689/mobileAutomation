package org;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        if(isArmstrong(number)) System.out.println(number+" is armstrong");
        else System.out.println(number+" not armstrong");
    }

    public static boolean isArmstrong(int number){
        int count=0;
        int temp=number;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        temp=number;
        int sum = 0;
        int digit=0;
        while (temp>0){
            digit=temp%10;
            sum += (int) Math.pow(digit,count);
            temp = temp/10;
        }
        return number == sum;
    }
    //153 = 1^3+5^3+3^3
}
