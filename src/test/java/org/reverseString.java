package org;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        System.out.println(reversedString(inputString));
    }

    public static String reversedString(String inputString){
        String reverseString = "";
        char ch;
        for(int i=0;i<=inputString.length()-1;i++){
            ch = inputString.charAt(i);
            reverseString = ch+reverseString;
        }
        return reverseString;
    }
}
