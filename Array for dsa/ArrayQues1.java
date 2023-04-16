// Question :- Take input of an array from user than swap it.

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQues1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap( int[] arr, int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
