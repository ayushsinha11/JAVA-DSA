package Searching;

import java.util.Scanner;

public class maxwealth {
    public static void main(String[] args) {

    }
    public int maxwealth(int[][] arr)
    {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++) {
                sum += ints[col];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
