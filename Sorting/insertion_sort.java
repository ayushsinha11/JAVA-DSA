package Sorting;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        search(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void search(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j]<arr[j-1]) {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                    break;
            }
        }
    }
}
