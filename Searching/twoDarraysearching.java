package Searching;
import java.util.*;
import java.lang.annotation.Target;
import java.util.Scanner;

public class twoDarraysearching {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int row=in.nextInt();
        int col=in.nextInt();

        //ARRAY CREATION:
        int [][] arr=new int[row][col];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
                arr[i][j]=in.nextInt();
        }
        int target=in.nextInt();
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr,int target)
    {

        for (int i=0;i< arr.length;i++)
        {
            for (int j=0;j< arr.length;j++){
            if (arr[i][j]==target)
                return new int[]{i, j};}
        }  return new int[]{-1,-1};
    }
}
