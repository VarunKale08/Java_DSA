package binarySearch;

public class ceilingProblem {
    public static void main(String[] args) {
        
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        int ans = ceil(arr, target);
        System.out.println(ans);

    }

    static int ceil(int[] arr, int target)
    {
        int start =0, end = arr.length-1;
        int ans = -1;

        // if target is greater than largest element in the array.
        if(target > arr[end])
        {
            return -1;
        }
        while(start <= end )
        {
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
            {
                return arr[mid];
            }
            else if(arr[mid] > target)
            {
               
                end = mid-1;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
        }
        return arr[start] ;
    }
    
}
