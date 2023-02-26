package arrays_arrayList;

import java.util.Arrays;

public class max {
    public static void main(String[] args) {
        int[] arr = {1, 254 , 33, 454, 65};
        reverse2(arr);
        System.out.println(max(arr));

        System.out.println(maxRange(arr, 0,2 ));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
       
        
    }  

    static void reverse2(int[] arr)
    {
        for (int i = arr.length-1; i > 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
    
    static void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;


        while(start<end)
        {
            swap(arr, start, end);
            start++;
            end--;
        }
        
    }

    static void swap(int[] arr, int index1, int index2)
        {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }

    static int max(int[] arr)
    {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            
           if(arr[i]>max)
           {
            max = arr[i];
           }
            
        }
        return max;
    }


    static int maxRange(int[] arr, int start, int end)
    {
        int max = arr[start];
        for (int i = start+1; i < end; i++) {

            if(arr[i] > max)
            {
                max = arr[i];
            }            
        }
        return max;
    }
}
