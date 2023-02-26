package binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr ={-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;

        int ans = OrderAgnosticBs(arr, target);
        System.out.println(ans);
    }

    static int OrderAgnosticBs(int[] arr, int target)
    {
      int start = 0;
      int end = arr.length-1;
        // find whether the array is sorted in ascending or desecending
        boolean isAsc =arr[start] < arr[end];

        while(start <= end)
        {
          int mid = start + (end - start)/2;
            
            if(arr[mid] == target)
            {
                return mid;
            }
            
            if(isAsc)  //for ascending
            {
                if(target > arr[mid])
                {
                    start = mid + 1;
                }
                else if(target < arr[mid])
                {
                    end = mid -1;
                }
            }
            else // for descending
            {
                if(target > arr[mid])
                {
                    end = mid-1;
                }
                else if(target < arr[mid])
                {
                    start = mid+1;
                }
            }
        
        }
        
    return -1;
    }
    
}
