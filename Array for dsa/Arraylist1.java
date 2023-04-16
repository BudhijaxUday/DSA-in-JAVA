import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(454);

        System.out.println(list);

//        Input
        for(int i = 0 ; i < 5 ; i++){
            list.add(in.nextInt());
        }
//        Get item from any index
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(list.get(i));        // pass index here, list[index] syntax will not work here
        }
    }
}
