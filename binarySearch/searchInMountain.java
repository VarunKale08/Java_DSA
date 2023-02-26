package binarySearch;

public class searchInMountain {
    public static void main(String[] args) 
    {
        int[] arr= {1,2,3,4,5,3,1};
        int target = 5;
        
        int peakElement =  peak(arr);        
        // System.out.println(peakElement);

          // for ascending side
          int ans = orderAgnostic(arr, target, 0, peakElement);
       
          // if target element is not found
          if(ans == -1)
          {
              //for descending side of array / other side of the peak element
              ans = orderAgnostic(arr, target, peakElement+1, arr.length-1);
          }
        //  ans = search(arr, target);

        System.out.println(ans);


    }

    // static int search(int[] arr, int target)
    // {
    //     int peakElement =  peak(arr);
        
    //     return peakElement;        


    // }
    
    static int peak(int[] arr)
    {
        int start = 0, end= arr.length-1;

        while(start < end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1])
            {
                end = mid;
            }
            else 
            {
                start = mid+1;
            }
        }
        return start;
    }

    static int orderAgnostic(int[] arr, int target, int start, int end)
    {
        boolean asc = arr[start] < arr[end];

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
            {
                return mid;
            }

            if(asc)
            {
                if(arr[mid] > target)
                {
                    end = mid-1;
                }
                else if(arr[mid] < target)
                {
                    start = mid+1;
                }
               
            }    

            else 
            {
                if(arr[mid] > target)
                {
                    start = mid+1;
                }
                else if(arr[mid] < target)
                {
                    end = mid-1;
                }
                
            }
        }
        return -1;
    }


}
