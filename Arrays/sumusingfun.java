package Arrays;
import java.util.Scanner;
public class sumusingfun {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=in.nextInt();
        }
       int a= sum(arr);
        System.out.println(a);
    }
    static int sum(int[] arr)
    {
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
}
