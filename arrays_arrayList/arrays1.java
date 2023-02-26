package arrays_arrayList;

import java.util.Arrays;

public class arrays1 {
    public static void main(String[] args) {
        
        int[] rollNo = new int[5];

        int[] rnos2 ={23,45,67,89}; 

        System.out.println(rnos2[3]);

       int[] a = {1, 2, 3, 4};
        change1(a);
       System.out.println(Arrays.toString(a));
        
    }

    static int change1(int[] a)
    {
       return a[1] = 5;   // call by value works on arrays as they are non primitive
    }
}
