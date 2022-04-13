package com.ayush;

import java.util.Scanner;

public class frames {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        int[] f = new int[50];
        System.out.println("Enter the number of frames :");
        n=in.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.print(" The value of frame is "+i);
            f[i]=in.nextInt();
        }
    }
}
