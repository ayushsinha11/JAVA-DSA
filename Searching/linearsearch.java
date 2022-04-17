package Searching;
import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < nums.length; i++)
            nums[i]=in.nextInt();
        System.out.println("Enter the element to be searched");
        int target=in.nextInt();
        int ans=linear(nums,target);
        System.out.println(ans);
    }
    static int linear(int[] arr,int target){
         if (arr.length==0)
             return -1;
        for (int i = 0; i <arr.length ; i++) {
            int element=arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}
