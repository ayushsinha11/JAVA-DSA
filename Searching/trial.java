package Searching;
import java.util.Scanner;
public class trial {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < nums.length; i++)
            nums[i]=in.nextInt();
        System.out.println("Enter the element to be searched");
        int element=in.nextInt();
        int ans=linear(nums,element);
        System.out.println(ans);
    }
    static int linear(int[] arr,int element){
        if (arr.length==0)
            return -1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == element)
            return i;
        }
        return -1;
    }
}
