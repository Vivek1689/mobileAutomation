package org;

import java.util.Scanner;

public class numberPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int inputNumber = sc.nextInt();
        if(isPalindrome(inputNumber)) System.out.println(inputNumber+" is palindrome");
        else System.out.println(inputNumber + " is not palindrome");
    }
    static boolean isPalindrome(int inputNumber){
        int originalNumber=inputNumber;
        int reverseNumber=0;
        while(inputNumber>0){
            int reminder= inputNumber%10;
            reverseNumber=(reverseNumber*10)+reminder;
            inputNumber=inputNumber/10;
        }
        return originalNumber == reverseNumber;
    }
}
