package Arrays;
import java.util.*;
//import java.util.Scanner;
public class searching_2d_array {
    public static void main(String[] args) {
        int[][]arr={
                {1 , 2 , 3 },{4 ,5,6},{7,8,9}
        };
        int target=3;
        int []ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][]arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == target) {
                    return new  int[]{i,j} ;
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
