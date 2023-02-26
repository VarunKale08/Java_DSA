package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={-18, -3, 0, 1, 5 ,15};
        int[] arr2 ={89, 45, 34, 23, 12 ,4, 2, 1};
        int ans = binarySearch1(arr, 15);
        System.out.println(ans);
        int ans2 = binarySearch2(arr2, 34);
        System.out.println(ans2);
    }


     //it is code for array sorted in DESCENDING order
    static int binarySearch2(int[]arr, int target)
    {
        int start =0;
        int end = arr.length-1;

        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if(target > arr[mid])
            {
                end = mid-1;
            }
            else if(target<arr[mid])
            {
                start = mid+1;
            }
            else  return mid;
        }
        return -1;
    }

    //it is code for array sorted in ASCENDING order
    // return the index
    // return -1 if it does not exist
    static int binarySearch1(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

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
}
