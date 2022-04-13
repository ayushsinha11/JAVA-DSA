package com.ayush;
import java.util.Scanner;
public class occurrence_problem  {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=0;
        int rem=0;
        System.out.println("Enter the number");
        int n= in.nextInt();
        System.out.println("Enter the element whose occurrence is to be searched");
        int i=in.nextInt();

        while (n>0)
        {
            rem=n%10;
            if (rem==i)
            {
                count++;

            }
            n=n/10;

        }
        System.out.println(count);
    }
}
