package arrays_arrayList;

import java.util.Arrays;
import java.util.Scanner;

public class multiDim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][]; // giving the value of column is not mandatorys


        int[][] arr ={
            {1, 2, 3},  //0th index
            {4, 5},     //1st index
            {6, 7, 8, 9} //2nd index
        };

        int[][] arr3 = new int[3][3];

        // taking input from 2d array
        for (int i = 0; i < arr3.length; i++) 
        {
            for (int j = 0; j < arr3[i].length; j++) 
            {
                arr3[i][j] =  sc.nextInt();
            }    
        }

        // Taking output from 2d array //
        for (int i = 0; i < arr3.length; i++) 
        {
            for (int j = 0; j < arr3[i].length; j++) 
            {
                System.out.print( arr3[i][j]);
            }    
            System.out.println();
        }


        //printing 2d arrays usong arrays.toString method

        for (int i = 0; i < arr3.length; i++) 
        {
            System.out.println(Arrays.toString(arr3[i]));
        }
    }
    
}
