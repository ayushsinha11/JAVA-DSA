package DSASHEET;
import java.util.*;
public class max_sum_subarray_03 {
    public static void main(String[] args) {
        int []arr={5,4,-1,7,8};
        System.out.println(sum(arr));
    }
    static int sum(int[] arr)
    {
        int maxsum=arr[0];
        int curentsum=0;
        for (int i = 0; i < arr.length ; i++) {
            curentsum+=arr[i];
            if (curentsum>maxsum)
                maxsum=curentsum;
            if (curentsum<0)
                curentsum=0;
        }
        return maxsum;
    }
}
