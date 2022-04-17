package Searching;
import java.util.Scanner;
public class lin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i]=in.nextInt();
        System.out.println("Enter the array element to be searched :");
        int element=in.nextInt();
        for (int i = 0; i < arr.length ; i++)
            if (element==arr[i]  )
                {
                    System.out.println(arr[i]);
                }
    }
}
