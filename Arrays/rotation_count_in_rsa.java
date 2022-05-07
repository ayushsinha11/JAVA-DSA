package Arrays;

public class rotation_count_in_rsa {
    public static void main(String[] args) {
        int []arr={1,2,3};
        int ans=search(arr);

        System.out.println(ans);
    }
    static int search(int[] arr)
    {
        int start=0;
        int end = arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>=arr[end])
            {
                start=mid+1;
            }
            else
                end=mid;
        }
        return start;
    }
}
