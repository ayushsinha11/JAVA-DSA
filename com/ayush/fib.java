package com.ayush;
import java.util.Scanner;
public class fib {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for (int i=1;i<=n;i++)
        {
            int next=a+b;
            System.out.println(next);
            a=b;
            b=next;
        }
    }
}
