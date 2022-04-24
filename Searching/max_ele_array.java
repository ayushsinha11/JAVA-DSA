package Searching;

public class max_ele_array {
    public static void main(String[] args) {
        int[] arr={10 ,11,12 ,13,9 ,8 ,7 ,3,1};
        int res=search(arr);
        System.out.println(res);
    }
    static int search(int [] arr)
    {
        int start=0;
        int ans=0;
        int end = arr.length-1;

        int mid =start+(end-start)/2;
         if (arr[mid]>arr[mid+1]){
              ans=arr[mid];
         }
         return ans;
    }
}
