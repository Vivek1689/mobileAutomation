package org;

import java.util.Scanner;

public class characterOccurence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("Enter character to be checked");
        String character = scanner.nextLine();
        System.out.println(occurenceCharacter(word,character));
    }
    public static int occurenceCharacter(String word, String character){
        int k=0;
        for (int i=0;i<word.length();i++){
            if (character.equalsIgnoreCase(String.valueOf(word.charAt(i)))){
                k++;
            }
        }
        return k;
    }
}
