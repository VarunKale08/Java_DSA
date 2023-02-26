package binarySearch;

public class floorProblem {
    public static void main(String[] args) 
    {
        int[] arr= {2, 3, 5, 9, 14, 16, 18};
        int floor = 1;

        int ans = floor(arr, floor);
        System.out.println(ans);
    
    }
        static int floor(int[] arr, int target)
        {
            int start = 0, end = arr.length-1;
            
            // if target element is less than smallest elemnt in the array
            if(target < arr[start])
            {
                return -1;
            }
            while(start <= end)
            {
                int mid = start + (end - start)/2;

                if(arr[mid] == start)
                {
                    return arr[mid];
                }
                else if(arr[mid] < target)
                {
                    start = mid + 1;
                }
                else if(arr[mid] > target)
                {
                    end = mid - 1;
                }
            }
            return arr[end];
    }
    
}
