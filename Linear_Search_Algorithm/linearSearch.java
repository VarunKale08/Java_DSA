package Linear_Search_Algorithm;

public class linearSearch {
    public static void main(String[] args) {
        int[] num = {12,34,56,78,90,19};
        int target = 19;

        // int ans = linSearch(num, target);
        // System.out.println(ans);

        boolean a = linSearch3(num, 55);
        System.out.println(a);
    }

    // search the target and return true or false
    static boolean linSearch3(int[] arr, int target)
    {
        
        if(arr.length == 0)
        {
            return false;
        }

        // run a for loop
        for (int i = 0; i < arr.length; i++) 
        {
            // check for element at every index if it is = target
            int element = arr[i];
            if(element == target)
            {
                return true;
            }
        }
        //if none of the above return statement execute hence target not  found
        return false;
    }


    // search the target and return the element itself
    static int linSearch2(int[] arr, int target)
    {
        
        if(arr.length == 0)
        {
            return -1;
        }

        // run a for loop
        for (int i = 0; i < arr.length; i++) 
        {
            // check for element at every index if it is = target
            int element = arr[i];
            if(element == target)
            {
                return element;
            }
        }
        //if none of the above return statement execute hence target not  found
        return -1;
    }



    //search in the array : return the index if item found
    //otherwise if item not found return -1

    static int linSearch(int[] arr, int target)
    {
       
        if(arr.length == 0)
        {
            return -1;
        }

        // run a for loop
        for (int i = 0; i < arr.length; i++) 
        {
            // check for element at every index if it is = target
            int element = arr[i];
            if(element == target)
            {
                return i;
            }
        }
        //if none of the above return statement execute hence target not  found
        return -1;
    }


}
