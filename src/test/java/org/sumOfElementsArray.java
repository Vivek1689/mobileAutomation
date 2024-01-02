package org;

public class sumOfElementsArray {
    public static void main(String[] args){
        int[] numbers = {2,4,5,45,34,21,10};
        System.out.println(sumOfArray(numbers));
    }
    
    public static int sumOfArray(int[] numbers){
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        return sum;
    }
}
