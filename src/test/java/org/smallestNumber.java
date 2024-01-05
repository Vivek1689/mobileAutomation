package org;

public class smallestNumber {
    public static void main(String[] args){
        int a= 2,b=5,c=3;
        int smallest = a<b?(a<c?a:c):(b<c?b:c);
        System.out.println(smallest);
    }
}
