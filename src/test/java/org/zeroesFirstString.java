package org;

import java.util.Scanner;

public class zeroesFirstString {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String inputString = scanner.nextLine();
        System.out.println(zeroFirstString(inputString));
    }

    public static String zeroFirstString(String inputString){
        char[] arrayOfDigits = inputString.toCharArray();
        String zeroFirstString = "";
        for(int i=1;i<=2;i++){
            for (char arrayOfDigit : arrayOfDigits) {
                if (i == 1 && arrayOfDigit == '0') {
                    zeroFirstString += arrayOfDigit;
                }
                if (i == 2 && arrayOfDigit != '0') {
                    zeroFirstString += arrayOfDigit;
                }
            }
        }
        return zeroFirstString;
    }
}
