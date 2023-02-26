package binarySearch;

public class splitArrayLargestSum {
    public static void main(String[] args) 
    {
        int[] nums = {7, 2, 5, 8, 10};
        int ans = splitArray(nums, 0);
        System.out.println(ans);

    }
    
    static int splitArray(int[] nums, int k) 
    {
        int maxValue=0, minValue=Integer.MIN_VALUE;

        for(int i = 0; i< nums.length; i++)
        {
            if(minValue < nums[i])
            {
                minValue = nums[i];
            }

            maxValue = maxValue + nums[i];
        }
      
        int start = minValue;
        int end = maxValue;

        while(start < end)
        {
            int mid = start + (end - start)/2;

            int sum = 0;
            int pieces = 1; //intially one whole array

            for (int num : nums) 
            {
                if(num + sum > mid)
                {
                    //we create a new sub array as its limit exceed more than the mid
                    //then sum = num
                    pieces++;
                    sum= num;
                }
                else
                {
                    sum+=num;
                }
            }
            
            if(pieces > k)
            {
                start = mid+1;
            }
            else 
            {
                end = mid;
            }

        }

        return end; //here start == end
    }
}
