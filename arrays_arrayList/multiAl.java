package arrays_arrayList;

import java.util.ArrayList;
import java.util.Scanner;
public class multiAl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();

        //initialization the rows
        for (int i = 0; i < 3; i++) {
            list1.add(new ArrayList<>());
        }

        // add elements in the columns of individual rows
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1.get(i).add(sc.nextInt());
            }
            
        }

        System.out.println(list1);
    }
    
}
