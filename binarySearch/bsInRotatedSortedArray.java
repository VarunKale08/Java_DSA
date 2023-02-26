package binarySearch;

public class bsInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
    //NOT WORK FOR DUPLICATE VALUES IN ARRAY
    public int search(int[] nums, int target) 
    {
        int pivot = findPivot(nums);

        //if pivot is not found array is not rotated
        // do normal binary search
        if(pivot == -1)
        {
            return binarySearch1(nums, target, 0, nums.length-1);
        }
        //if pivot is found, we have found 2 ascending sorted arrays
        if(nums[pivot] == target)
        {
            return pivot;
        }

        if(target >= nums[0])
        {
            return binarySearch1(nums, target, 0, pivot-1);
        }

        return binarySearch1(nums, target, pivot+1, nums.length-1);
    }

    static int binarySearch1(int[] arr, int target, int start, int end)
    {
        while(start<=end)
        {
            //find the middle element
            // int mid = (start+end)/2; // might be posible that it exceeds the range of int in java

            int mid = start + (end - start) / 2;

            if(target < arr[mid])
            {
                end = mid-1;
            }
            else if(target> arr[mid])
            {
                start = mid + 1;
            }
            else 
            {
                return mid; // returns the index
            }
        }
        return -1;
    }
    
    static int findPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;


            //4 cases
            // (mid < end) is index out of bound if mid is last element of the array
            if(mid < end && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            // (mid > start) is if mid is on the start then mid-1 will goin -ve index i.e out of bound
            if(mid > start && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
            //
            if(arr[start] >= arr[mid])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
            
        }
        return -1;
    }
}
