package org;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        System.out.println(reversedString(inputString));
    }

    public static String reversedString(String inputString){
        StringBuilder reverseString = new StringBuilder();
        char ch;
        for(int i=0;i<=inputString.length()-1;i++){
            ch = inputString.charAt(i);
            reverseString.insert(0, ch);
        }
        return reverseString.toString();
    }
}

/*
1. Factorial of a number using recursion or loop.
2. Print Fibonacci series.
3. Find sum of digits of a number.
4. Print prime numbers.
5. Multiply 2 number without using * operator.
6. Print table of a number.
7. Convert decimal number to binary.
8. Linear and Binary search.
9. Basic sorting techniques like insertion,quick,heap,merge sort
10. Reverse a string without using library function.
1- Write code to filter duplicate elements from an array and print as a list?
2- Write code to sort the list of strings using Java collection?
3- Write a function to reverse a number in Java?
4- Write a method to check prime no. in Java?
5- Write a Java program to find out the first two max values from an array?
6- Write a Java program to find the longest substring from a given string which doesn’t contain any duplicate characters?
7- Write Java code to get rid of multiple spaces from a string?
8- Write Java code to identify a number as Palindrome?
9- Write Java code to swap two numbers without using a temporary variable?
10- Write a Java program to demonstrate string reverse with and without StringBuffer class?
*/
