public class findingSum {
    public static void main(String[] args) {
        int[] array = {-1,2,4,7,8,10,12,16,19,24};
        int targetNumber = 18;
        int leftPointer = 0;
        int rightPointer = array.length-1;
        for (int i=0;i<array.length;i++){
            if (array[leftPointer]+array[rightPointer]<targetNumber){
                leftPointer++;
            }else if (array[leftPointer]+array[rightPointer]>targetNumber) {
                rightPointer--;
            }else{
                System.out.println(array[leftPointer]+" "+array[rightPointer]);
                leftPointer++;
                rightPointer--;
            }

        }
//time complexity is more
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==18){
                    System.out.println(array[i]+" "+array[j]);
                }
            }
        }
    }
}
