package binarySearchIn2dArray;

import java.util.Arrays;

/**
 * rowColMatrix
 */
public class rowColMatrix {

    public static void main(String[] args) {
        // int[][] nums = { {10, 20, 30, 40},
        // {15, 25, 35, 45},
        // {28, 29, 37, 49},
        // {33, 34, 38, 50}};

        int[][] nums = { {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};
        int[] ans = findIndx(nums, 7); 

        System.out.println(Arrays.toString(ans));
    }

    static int[] findIndx(int[][] nums, int target)
    {
        int r = 0, c = nums.length-1;
        
        while(r <= nums.length-1 && c >= 0)
        {
            if(nums[r][c] == target)
            {
                return new int[] {r, c};
            }
            else if(nums[r][c] > target)
            {
                c--;
            }
            else
            {
                r++;
            }
        }
        return new int[] {-1, -1};
    }
}