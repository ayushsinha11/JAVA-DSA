package LeetCode;

public class peak_index_in_array {
    public static void main(String[] args) {
        int[] arr=  {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));

    }
    static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){  //in the end start and end will point to larger element
                            // hence start==end will be loop terminating condition.
            int mid=start+(end -start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return arr[start];
    }
}
