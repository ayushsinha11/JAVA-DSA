package com.ayush;

import java.util.Scanner;

public class digitsum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int ans=sod(n);
        System.out.println(ans);
    }
    static int sod(int n)
    {
        return (n%9!=0)?n%9:9;
    }
}
