//Question :- Max value of an array,in a range also.

import java.util.Scanner;

public class ArrayQues2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,2));
    }
     static int max(int[] arr){
        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int maxRange(int[] arr , int start , int end){
        int max = arr[start];
        for(int i = start ; i < end ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
