package Functions;
import java.util.*;
import java.util.Scanner;

public class change {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr={2,6,8,89,74};
        changevalue(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void changevalue(int[] nums){
        nums[0]=99;
    }
}
