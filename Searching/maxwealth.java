package Searching;

import java.util.Scanner;

public class maxwealth {
    public static void main(String[] args) {

    }
    public int max(int[][] arr)
    {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
