package binarySearch;

public class countOfRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findPivot(arr);
        // ans will pe pivot + 1
        System.out.println(ans+1);
    }

    static int findPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1])
            {
                return mid;
            }
            if(arr[mid]< arr[mid-1])
            {
                return mid-1;
            }

            if(start > mid)
            {
                end = mid - 1;
            }
            else 
            {
                start = mid + 1;
            }
        }
        return -1;
    }
    
}
