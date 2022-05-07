package Arrays;
import java.util.*;
public class rowcolmatrix {
    public static void main(String[] args) {
        int [][] arr={ {1 , 2 , 3 },{4 ,5,6},{7,8,9} };
        int target=3;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int [][]matrix,int target) {    //int [] means we are returning an array.
        int row = 0;
        int col = matrix.length-1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target)
                return new int[]{row, col};
            else if (matrix[row][col] > target) {
                col--;
            } else
                row++;
        }
        return new int[]{-1, -1};
    }
}
