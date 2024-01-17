package org;

import java.util.ArrayList;
import java.util.Scanner;

public class longestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        ArrayList<String> stringArrayList = new ArrayList<>();
        int longest = 0;
        for (int i=0;i<inputString.length();i++) {
            stringArrayList.add(String.valueOf(inputString.charAt(i)));
            for (int j = i + 1; j <=inputString.length() - 1; j++) {
                if (stringArrayList.contains(String.valueOf(inputString.charAt(j)))) {
                    break;
                }else stringArrayList.add(String.valueOf(inputString.charAt(j)));;
            }
            if (longest < stringArrayList.size()) longest = stringArrayList.size();
            stringArrayList.clear();
        }
        System.out.println(longest);
    }
}