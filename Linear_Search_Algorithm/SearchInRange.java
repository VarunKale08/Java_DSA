package Linear_Search_Algorithm;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 3};
        int ans = searchInRange(arr, 4, 5, 3);
        System.out.println(ans);
    }

    static int searchInRange(int[] arr,int startIdx, int lastIdx, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        for (int i = startIdx; i <= lastIdx; i++) 
        {
            if(arr[i] == target)
            {
                return i;
            }    
        }

        return -1;
    }
}
