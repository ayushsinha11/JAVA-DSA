package Arrays;
import java.util.*;
import java.util.Scanner;

public class perfectsq {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i]=in.nextInt();
        }
            int sum=0;
            for (int i = 0; i < n; i++)
            {
                sum=sum+isperfectsquare(arr,arr[i]);
            }
            System.out.println(sum);
        }


    static int isperfectsquare(int[] num,int n){
        if (n<2) {
            return n;
        }
        int i=1;
        while(i*i<=n){
            i++;
        }
        return i-1;
    }
}
