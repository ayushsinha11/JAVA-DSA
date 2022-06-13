package DSASHEET;

public class search_in_rotated_sorted_array_06 {
    public static void main(String[] args) {
        int []arr={4,5,6,7,0,1,2};
        int target=5;
        int ans=search(arr,target);
        System.out.println(ans);

    }
    static int search(int []arr,int target){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[end])
                start=mid+1;
            else
                end=mid;
        }
        int begin=start;
        start=0;
        end= arr.length-1;
         if (target>=arr[begin]&&target<=arr[end])
             start=begin;
         else {
             end=begin;
         }
         while(start<=end){
             int mid=start+(end-start)/2;
             if(arr[mid]>target)
                 end=mid-1;
             else if(arr[mid]<target)
                 start=mid+1;
             else {
                 return mid;
             }
         }
         return -1;
    }
}
