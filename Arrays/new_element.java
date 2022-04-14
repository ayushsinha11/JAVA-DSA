package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class new_element {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the size of matrix :");
        int n=in.nextInt();
        int [] a=new int[n];
        int[] b=new int[n+1];
        for (int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Enter the index :");
        int m=in.nextInt();
        System.out.println("Enter the value to be inserted :");
        int v=in.nextInt();
        for(int i=0;i<=n;i++)
        {
            if (i<m)
            {
                b[i]=a[i];
            }
            else if(i==m)
            {
                b[i]=v;
            }
            else
            {
                b[i]=a[i-1];
            }
        }
        System.out.println(Arrays.toString(b));


    }
}
