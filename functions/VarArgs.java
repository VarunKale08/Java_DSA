package functions;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5, 6);
        multiple(12, 56, "Kale", "Varun", "Pankaj", "Rashmi");

    }
    static void multiple (int a, int b, String ...v) //variable length arguments always come at the end.
    {
        System.out.println(a+b+Arrays.toString(v));
    }

    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    
}
