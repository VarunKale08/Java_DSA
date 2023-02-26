package arrays_arrayList.Leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class Build_Array_from_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[6];

        for (int i = 0; i <a.length ; i++) 
        {
            a[i] = sc.nextInt();
        }

        int[] ans = new int[a.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = a[a[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
    
}
