package LeetCode;
import java.util.*;
import java.util.Arrays;

public class two_d_array_BS {
    public static void main(String[] args) {
        int[][]arr={
                {1 , 2 , 3 },{4 ,5,6},{7,8,9}
        };
        int target=3;
        boolean ans=searchMatrix(arr,target);
        System.out.println((ans));

    }
    static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
            return false;
        int row= matrix.length;//number of rows
        int col= matrix[0].length;//number of  col on row 0
        int start=0;
        int end=row*col-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            int mid_element=matrix[mid/col][mid%col];
            if (mid_element==target)
                return true;
            else if (mid_element<target) {
                start=mid+1;
            }
            else
                end=mid-1;

        }
        return false;
    }
}
