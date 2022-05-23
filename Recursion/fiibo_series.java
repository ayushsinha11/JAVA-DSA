package Recursion;

import java.util.Scanner;

public class fiibo_series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 6;
        for (int i = 0; i < n; i++) {
            System.out.println(fibono(i) + " ");
        }
    }
    static int fibono(int n) {

            if (n < 2)
                return n;
        return fibono(n - 1) + fibono(n - 2);

    }
}