package LeetCode;

public class infinitearray {
    public static void main(String[] args) {
    int[] arr={3,5,7,9,10,90,100,130,140,160,170};
    int target=5;
    int res=ans(arr,target);
        System.out.println(res);
    }
    //logic to search in chunks
    //Basically this is range calculation.
    static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newstart=end+1;
            end=end+(end-start+1)*2;//end=previous end+2*size of box
            start=newstart;
        }
        return search(arr,target,start,end);
    }
    static int search(int[] arr,int target,int start,int end)
    {
//        int start=0;
//        int end =arr.length-1;

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
