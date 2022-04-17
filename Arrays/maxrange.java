package Arrays;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;
public class maxrange {
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
        System.out.println("Enter the index range :");
        int p=in.nextInt();
        int q=in.nextInt();
        int a=max(arr,p,q);
        System.out.println("Max value within the array is :"+a);
    }
    static int max(int[] arr,int start,int end){
        int maxvalue=arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i]>maxvalue)
            {
                maxvalue=arr[i];
            }
        }
        return maxvalue;
    }
}
