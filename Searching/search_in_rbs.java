package Searching;

public class search_in_rbs {
    public static void main(String[] args) {
        int []arr={1,3};
        int target=3;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target) {
            int pivot =findpivot(arr);
            if (pivot==-1) {
                return binarysearch(arr, target, 0, arr.length - 1);
            }
            if(arr[pivot]==target)
                return pivot;
            if (target >=arr[0]){
                return binarysearch(arr,target,0,pivot-1);
            }
            else
                return binarysearch(arr,target,pivot+1,arr.length-1);
    }
    static int findpivot(int []arr)
    {
        int start=0;
        int end= arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[end])
                start=mid+1;
            else
                end=mid;
        }
       return start;

        }
        static int binarysearch(int[] arr,int target ,int start,int end)
        {
            while (start <= end){
                int mid =start+(end-start)/2;
                if (target<arr[mid])
                    end=mid-1;
                else if (target>arr[mid])
                {
                    start=mid+1;

                }
                else
                    return mid;
            }
            return -1;
        }

}


