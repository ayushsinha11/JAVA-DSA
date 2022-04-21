package LeetCode;
import java.util.Scanner;
public class smallest_letter {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the size of an array :");
        int n=in.nextInt();
        char[]arr=new char[n];
        System.out.println("Enter the characters into the array :");
        for (int i = 0; i <n ; i++) {
            arr[i]=in.next().charAt(0);
        }
        System.out.print("Enter the element to be searched :");
        char target =in.next().charAt(0);
        char ans=search(arr,target);
        System.out.println(ans);
    }
    static char search(char[] arr,int target){
        int start=0;
        int end= arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }

        }
        return arr[start % arr.length];
    }
}
