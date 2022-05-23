package Arrays;
import java.util.*;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++)
            {
                arr[i]= in.nextInt();
            }
        int start=0;
        int end= arr.length-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start ++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }
}

