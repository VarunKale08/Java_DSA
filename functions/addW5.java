package functions;
import java.util.*;
public class addW5 {

    //main function
    public static void main(String[] args) {
        // sum1();
        
        // int ans = sum2();
        // System.out.println(ans);

        // String ans = greet();
        // System.out.println(ans);

        // int ans = sum3(30,90);
        // System.out.println(ans);
        
        // sum4(34, 90);
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String a = in.nextLine();

        String outP = myGreet(a);
        System.out.println(outP);


        

    }

    static String myGreet(String a)
    {
        String message = "Hello " + a;
        return message;
    }

    static void sum4 (int a, int b)
    {
        System.out.println(a+b);
    }

    // pass the value of numbers when you are calling the method in main
    // using parameters

    static int sum3(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
    
    // returns the value to the main function
    static String greet()
    {
        String greeting = "how are you";
        return greeting;
    }

    static int sum2()  // returns value to main function
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 st no: ");
        int a = sc.nextInt();
        System.out.println("Enter 2 nd no: ");
        int b = sc.nextInt();

        int sum = a + b;
        return sum;

        // System.out.println("This will never execute as it is afte the return statemet");   ***
        
   
    }
    static void sum1()   // directly displays
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 st no: ");
        int a = sc.nextInt();
        System.out.println("Enter 2 nd no: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println(sum);   
    }

    
}
