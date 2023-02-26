package binarySearchIn2dArray;

import java.util.Arrays;

public class searchingIn2d {
    public static void main(String[] args) {
        int[][] nums = {{18, 9, 12},
                        {36, 4, 91},
                        {44, 33, 16}};
        int []ans = searchInTwoD(nums, 4);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchInTwoD(int[][] nums, int target)
    {
        for(int r = 0; r < nums.length-1;r++)
        {
            for(int c =0; c< nums[0].length; c++)
            {
                if(nums[r][c] == target)
                {
                    return new int[]  {r, c};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
