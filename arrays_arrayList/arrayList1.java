package arrays_arrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class arrayList1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // array list syntax
       ArrayList <Integer> list = new ArrayList <Integer>();
                            //or
        ArrayList <Integer> list1 = new ArrayList<>(10);

        ArrayList <Integer> a = new ArrayList<>(10);

        // .add() method to add intialze objects in the array list
        // a.add(67);
        // a.add(6787);
        // a.add(6765);
        // a.add(6756);
        // a.add(674);

        // a.set(0, 69);
        // a.remove(2);
        // System.out.println(a.contains(546));
        // System.out.println(a);

        //taking input from ArrayList
        for (int i = 0; i < 5; i++) 
        {
            a.add(sc.nextInt());    
        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
              System.out.print(a.get(i) + " "); // a[index] syntax will not work here   
        }

    }                    
    
}
