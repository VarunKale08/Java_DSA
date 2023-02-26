package arrays_arrayList;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        ArrayList<Integer>  t = new ArrayList<>();

        t.add(0);
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        
        System.out.println(t);
        
        // to check if shifting happens in arraylist 
        
        t.add(1, 5);
        System.out.println(t);

    }
    
}
