package Arrays;
import java.util.*;
import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter  elements into the array");
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the index to be Swapped");
        int p= in.nextInt();
            int q=in.nextInt();
            swap(arr,p,q);
            System.out.println(Arrays.toString(arr));
        }

    static void swap(int[] arr,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
