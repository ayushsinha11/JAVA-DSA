package com.ayush;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int rem=0;
        int rev=0;
        System.out.println("Enter the number to be reversed");
        int n= in.nextInt();
        while(n>0)
        {
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}
