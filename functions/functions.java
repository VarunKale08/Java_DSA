package functions;
import java.util.*;
public class functions {

    


    public static void main(String[] args) 
    {
        for (int i = 0; i < 2; i++) {
            sum();    
        }
        

    }


    static void sum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 st no: ");
        int a = sc.nextInt();
        System.out.println("Enter 2 nd no: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Their sum is " + sum );
        sc.close();
    }


}
