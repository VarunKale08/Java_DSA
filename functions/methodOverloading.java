package functions;

import java.util.Arrays;

public class methodOverloading {
    public static void main(String[] args) {
        // fun(12);
        // fun(3,4 );
        // fun("Kale");
        // int result = fun(5,10, 56);
        // System.out.println(result);
        // fun(1,2,3,4,5);
        // fun("Kale", "Varun", "Pankaj");

        fun(1);

    }


    

    // static void fun(String ...v)
    // {
    //     System.out.println(Arrays.toString(v));
    // }

    // static void fun(int ...v)
    // {
    //     System.out.println(Arrays.toString(v));
    // }


    static int fun(int a, int b, int c)
    {
        return a+b+c;
    } 
    static void fun(int a)
    {
        System.out.println(a);
    }

    

    static void fun(int a, int b )
    {
        System.out.println("" + a+ " " +b);
    }

    static void fun (String a)
    {
        System.out.println(a);
    }

}
