package Linear_Search_Algorithm;

public class forEachLoop {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 9};
        int sum = 0;

        for(int element : arr)
        {
            //System.out.println(element);
            sum = sum + element;
        }
        System.out.println(sum);
    }
}
