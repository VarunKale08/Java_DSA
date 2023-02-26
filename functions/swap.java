package functions;
import java.util.*;
public class swap {
    public static void main(String[] args) 
    {
        
        

        // int temp = a;
        // a = b;
        // b = temp;
    
        // System.out.println(a + "  "+b);


        swap(10, 20);

        String ans = changeName("Varun Kale");
        System.out.println(ans);


    }

    static String changeName(String a)
    {
        String name = "Krish Patel";
        a = name;
        return a;
    }

    static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + "  "+b);
    }
}
