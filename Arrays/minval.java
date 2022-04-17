package Arrays;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;
public class minval {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter  elements into the array");
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        int a=min(arr);
        System.out.println("Max value within the array is :"+a);
    }
    static int min(int[] arr){
        int minvalue=arr[0];
        //already 0th index ko man liye h min value ishliye for loop 1 se start ho rha h

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<minvalue)
                minvalue=arr[i];
        }
        return minvalue;
    }
}
