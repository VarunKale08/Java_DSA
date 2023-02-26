package Linear_Search_Algorithm;

public class FindMinNum {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 3};
        System.out.println(min(arr));
    }

    // assume arr.length is not equal to zero
    // return the minimum value in the array
    static int min(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) 
        {
                if(min > arr[i])
                {
                    min = arr[i];
                }   
        }
        return min;
    }
}
