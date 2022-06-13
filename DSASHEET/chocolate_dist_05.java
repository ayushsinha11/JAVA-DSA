package DSASHEET;
import java.util.*;
import java.util.Collections;
public class chocolate_dist_05 {
    public static void main(String[] args) {
            int[] arr={3, 4, 1, 9, 56, 7, 9, 12};
        System.out.println(choco(arr,5));
    }
    static int choco(int[] arr,int m){
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;

        for (int i = 0; i+m-1< arr.length ; i++) {
            int diff=arr[i+m-1]-arr[i];
            if (diff<mindiff)
                mindiff=diff;

        }
        return mindiff;
    }
}
