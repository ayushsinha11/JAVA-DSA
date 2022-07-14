package Recursion;

import java.util.Scanner;

public class nth_fib_pr1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        if (n<2){
            return n;
        }

        // base condition
        return fibo(n-1)+fibo(n-2);
    }
}
