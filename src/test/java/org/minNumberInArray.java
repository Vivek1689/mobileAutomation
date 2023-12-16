package org;

public class minNumberInArray {

    public static void main(String[] args) {
        int[][] numbers = {{2, 4, 5}, {3, 0, 7}, {1, 2, 9}};
        int columnNumber = 0;
        int minNumber= numbers[0][0];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (minNumber>numbers[i][j]){
                    minNumber=numbers[i][j];
                    columnNumber = j;
                }
            }
        }
        System.out.println("Minimum number is "+ minNumber);
        int maxNumber = numbers[0][columnNumber];
        for (int i=0;i<3;i++){
            if (maxNumber<numbers[i][columnNumber]){
                maxNumber = numbers[i][columnNumber];
            }
        }
        System.out.println("Maximum number in Min column "+ maxNumber);
    }

}
