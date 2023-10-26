package org;

import java.util.Arrays;
import java.util.Scanner;

public class pangram {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check for pangram");
        String inputString = sc.nextLine();
        if(isPangram(inputString)) System.out.println("Entered String is pangram");
        else System.out.println("Entered string is not pangram");

    }
    public static boolean isPangram (String inputString){
        if (inputString.length()<26)return false;
        inputString = inputString.toLowerCase();
        Boolean[] tracker = new Boolean[26];
        Arrays.fill(tracker,Boolean.FALSE);
        for (int i=0;i<inputString.length();i++){
            if (isLetter(inputString.charAt(i))) {
                int index = inputString.charAt(i) - 'a';
                tracker[index] = true;
            }
        }
        for (int i=0;i<tracker.length;i++){
            if(!tracker[i]) return false;
        }
        return true;
    }

    public static boolean isLetter(char ch){
        return Character.isLetter(ch);
    }
}
