package Arrays;
import java.util.*;
import java.util.Scanner;

public class arraysum{
    public static void main(String[] args)  {
        int sum=0;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);

    }

}