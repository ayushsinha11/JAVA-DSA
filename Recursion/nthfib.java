package Recursion;

import java.util.Scanner;

public class nthfib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
            System.out.println(fibono(n));

    }
    static int fibono(int n) {

        if (n < 2)
            return n;
        return fibono(n - 1) + fibono(n - 2);

    }
}