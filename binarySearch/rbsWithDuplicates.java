package binarySearch;

public class rbsWithDuplicates {
    public static void main(String[] args) {

            int[] arr = {2,9,2,2,2};
            int ans = findPivotWithDuplicate(arr);
            System.out.println(ans);
    }

    static int findPivotWithDuplicate(int[] arr)
    {
        int start =0;
        int end = arr.length-1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1])
            {
                return mid-1;
            }

            // if elements in the start, mid, end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end] )
            {
                //NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if(arr[start] > arr[start +1])
                {
                    return start;
                }
                start++;

                //check whether the end is pivot or not
                if(arr[end] < arr[end-1])
                {
                    return end-1;
                }
                end--;
            }
            //left side is sorted, so pivot sould be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]))
            {
                start = mid+1;
            }
            else 
            {
                end = mid-1;
            }
            
        }

        return -1;
    }
}
