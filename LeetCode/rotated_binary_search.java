package LeetCode;

public class rotated_binary_search {
    public static void main(String[] args) {
    int []arr={4,5,6,7,0,1,2};
    int target=5;
    int ans=search(arr,target);
        System.out.println(ans);

    }
    static int search(int []arr,int target)
    {
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[end])
                start=mid+1;
            else
                end=mid;
        }//at last the start will point to the smallest element.
        //this while loop will break when the start will point to the smallest number.hence the pivot
        //So the starting point of our array, if it is sorted will be left.
         int begin=start;//contains the value of lowest element i.e pivot,for searching in right side
        //then we reset the boundary to do the regular binary search
             start=0;
             end =arr.length-1;
             //which side of the array we want to binary search on.
        if(target >=arr[begin]&& target<=arr[end])
            start=begin;// start ko pivot element prr set kr do aur end=arr.length-1 rahega.
        else
            end=begin;// nai to end ko pivot element prr set krr do aur start=0 rahega
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if (arr[mid]<target) {
                start=mid+1;
            }
            else
               end=mid-1;
        }
        return -1;
    }
}
