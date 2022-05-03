package LeetCode;
import java.util.*;
public class first_and_last_pos_sorted_array {
    public static void main(String[] args) {
int[] arr={5,7,7,7,7,7,7,7,7,7,7,8,8,10};
int target=7;
int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[] arr,int target){
        int[] result = new int[2];
        result[0] = firstelementindex(arr, target);
        result[1] = lastelementindex(arr, target);
        return result;
    }

    static int firstelementindex(int[] arr, int target) {
        int index=-1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target <= arr[mid])
                end = mid - 1;
            else {
                start = mid + 1;
            }
                if (target==arr[mid]) // agar mera targer mid k equal aa gya to index ko mid se update kr denge.
                {
                    index=mid;
                }

        }
    return index;
    }

    static int lastelementindex(int[] arr, int target) {
        int index=-1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target >= arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
            if (target==arr[mid])
            {
                index=mid;
            }

        }
        return index;
    }

}