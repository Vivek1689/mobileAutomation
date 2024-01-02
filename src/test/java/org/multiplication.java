package org;

public class multiplication {
    public static void main(String[] args){
        System.out.println(resultWithoutMultipleOperator(5,10));
     }


    public static int resultWithoutMultipleOperator(int number,int multipleOf){
        int result = 1;
        int sum=0;
        for (int i=1;i<=multipleOf;i++){
            int j=1;
            while(j<=i){
                sum += number;
                j++;
            }
            if (i==multipleOf){result=sum;
            return result;}

            sum=0;
        }
        return result;
    }
}
