public class Array1 {
    public static void main(String[] args) {
//        syntax of an array :-
//        datatype[] variable_name = new datatype[size];
//        store 5 roll numbers.
        int[] roll_no = new int[5];       // 'new' is used to create an object.
//        or directly
        int[] roll_nos = {22,32,54,23,55};
        int[] ros; // declaration of array,ros is getting defined in the stack.
        ros = new int[5]; // actually here object is being created in the memory (heap memory)
        System.out.println(roll_nos[1]);       // Output will be 32.

        String[] arr = new String[4];
        System.out.println(arr[0]);           // Output will be null.
    }
}
