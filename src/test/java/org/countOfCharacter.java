package org;

import java.util.ArrayList;

public class countOfCharacter {
    public static void main(String[] args) {
//ip=wwwppgbbbbttt
//op=w3p2g1b4t3
        String inputString = "wwwppgbbbbttt";
        char[] inputStringArray = inputString.toCharArray();
        ArrayList<Character> listCharacter = new ArrayList<>();
        for (int i = 0; i < inputStringArray.length; i++) {
            int k=1;
            if(!listCharacter.contains(inputStringArray[i])) {
                listCharacter.add(inputStringArray[i]);
                for (int j = i + 1; j < inputStringArray.length; j++) {
                    if (inputStringArray[i] == inputStringArray[j]) {
                        k++;
                    }
                }
                System.out.print(inputStringArray[i]);
                System.out.print(k);
            }
        }
    }
}

//we can solve this with hashmap with lesser time complexity
