package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Insertion {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n=in.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements in an array");
        for (int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(a));
//        for (int i=0;i<n;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
    }
}
