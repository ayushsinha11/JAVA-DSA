package Sorting;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr={3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void selection(int[] arr)// Selecting the smallest element and then placing it into its right index.
    {
        for (int i = 0; i < arr.length-1 ; i++) {
            int smallest=i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[smallest]>arr[j])
                {
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]= arr[i];
            arr[i]=temp;
        }
    }
}
