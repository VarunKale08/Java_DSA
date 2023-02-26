package functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Varun";
        {
            a =30; // reassigns the origin ref variable to some other value 
            //can change the values already intialised outside the block and also print tem or use them  outside the block
            int c = 87;
            // values intialized in the block will remain in the block, cannot used outside the block
            name = "Kale";
            System.out.println(name);
            a = 10000;
             
        }
        System.out.println(a);
        for (int i = 0; i < 4 ; i++) 
        {
            System.out.println(a );
        }
        System.out.println(name);
        System.out.println(a);
        
    }

    static void random()
    {
         
        // System.out.println(a);
    }
}
