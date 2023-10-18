package org;

public class pythagoreanTriplet {
    public static void main(String[] args){
        int[] numbers = {2,4,3,5,8,7,12,13};
        isPythagoreanTriplet(numbers);
    }
    public static void isPythagoreanTriplet(int[] numbers){
        for (int i=0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                for (int k=j+1;k<numbers.length;k++){
                    int x= numbers[i]*numbers[i];
                    int y = numbers[j]*numbers[j];
                    int z = numbers[k]*numbers[k];
                    if(x==y+z||y==x+z||z==x+y){
                        System.out.println(numbers[i]+" "+numbers[j]+" "+numbers[k]+" are pythagorean triplets");
                    }
                }
            }
        }
    }
}
