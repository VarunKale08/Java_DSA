package functions;

import java.util.Scanner;
import java.util.Scanner;
public class armstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // boolean ans = armstrongNo(n);
        // System.out.println(ans);

            for(int i =100;i<1000;i++)
            {
                if(armstrongNo(i))
                {
                    System.out.print(i + " ");
                }
            }
    }

    static boolean armstrongNo(int n)
    {
        int original = n;
        int sum=0;
        
            while(n>0)
            {
               int remainder = n % 10;
                n = n /10;
                sum = sum + remainder*remainder*remainder;
            }   
            

            // if(sum == original)
            // {
            //     return true;
            // }
           
            //     return false;
         
            return sum == original;
        
    }
}
