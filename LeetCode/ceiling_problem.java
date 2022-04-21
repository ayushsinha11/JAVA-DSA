package LeetCode;
import java.util.Scanner;
public class ceiling_problem {
    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
        System.out.print("Enter the size of an array :");
    int n=in.nextInt();
    int[]arr=new int[n];
        System.out.println("Enter the elements into the array :");
        for (int i = 0; i <n ; i++) {
            arr[i]=in.nextInt();
        }
        System.out.print("Enter the element to be searched :");
        int target =in.nextInt();
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int start=0;
        int end= arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
             if(target<arr[mid]){
                 end=mid-1;
             }
             else if(target>arr[mid]){
                 start=mid+1;
             }
             else {
                 return mid;
             }
        }
        return arr[start];
    }
}
