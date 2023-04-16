import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        /*
              1 3 4
              2 4 6
              6 8 3
         */
        Scanner sc = new Scanner(System.in);
//        int[][] arr = new int[row][column];     // Syntax of a 2d Array

//        Or Directly
      /*  int[][] arr = {
                {8,2,1},   //0th index
                {5,8},     //1st index
                {2,5,6,4,} //2nd index
        };           */

//        Input
        int[][] arr = new int[3][2];

        for(int i = 0 ; i < arr.length ; i++){
//            for each column in every row
           for(int j = 0 ; j < arr[i].length ; j++){
               arr[i][j] = sc.nextInt();
           }
        }
        for(int i = 0 ; i < arr.length ; i++){
//            for each column in every row
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        /*
        for(int row = 0 ; arr.length ; row++){
            System.out.println(Arrays.toString(arr[row])); 0-
        }
         */
    }
}
