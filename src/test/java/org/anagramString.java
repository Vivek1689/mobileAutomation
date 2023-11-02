package org;

import java.util.Arrays;

public class anagramString {
    public static void main(String[] args){
        String firstWord= "race";
        String  secondWord = "cake";
        if (firstWord.length()==secondWord.length()){
            char[] firstWordArray = firstWord.toCharArray();
            char[] secondWordArray = secondWord.toCharArray();
            Arrays.sort(firstWordArray);
            Arrays.sort(secondWordArray);
            if(Arrays.equals(firstWordArray,secondWordArray)){
                System.out.println(firstWord+"and"+secondWord+" are anagram");
            }else {
                System.out.println(firstWord+"and"+secondWord+" are not anagram");
            }
        }
    }
}
