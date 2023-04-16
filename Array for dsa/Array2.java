import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 32;
        arr[1] = 43;
        arr[2] = 33;
        arr[3] = 23;
        arr[4] = 16;
        System.out.println(arr[3]);    // Output will be 23.

//        input using for loop.
        for(int i=0;i< arr.length;i++){
            arr[i] = in.nextInt();       // for taking input from the user.
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");   // Output will be 32 43 33 23 16.
        }

        /*  System.out.println(arr[5]);   */   // this will give an error of "index out of bound".

//        array of objects
        String[] str = new String[4];
        int x;
        for (x = 0; x < str.length; x++) {
            str[x] = in.next();
        }
        System.out.println(Arrays.toString(str));            // Output will be 23,45,54,34
    }
}
