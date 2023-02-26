package Linear_Search_Algorithm;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 36},
            {18, 12}
        };
        int target = 34;
        int[] ans= search(arr, target);
        System.out.println(Arrays.toString(ans) );
        
        System.out.println(max(arr));// max of 2d array
        System.out.println(max2(arr));
    }
    
    static int max2(int[][] arr) // using enhanced for loop
    {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr ) 
        {
            for (int anInt : ints ) 
            {
                if(anInt > max)
                {
                    max = anInt;
                }    
            }    
        }

        return max;
    }

    static int max(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }    
            }    
        }

        return max;
    }
    static int[] search(int[][] arr, int target)
    {

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                if(arr[i][j] == target)
                {
                    return new int[]{i, j};
                }    
            }    
        }

        return new int[] {-1, -1};
    }

}
