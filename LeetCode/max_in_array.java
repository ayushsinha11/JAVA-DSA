package LeetCode;

public class max_in_array {
    public static void main(String[] args) {
        int[] arr={1 ,2 ,4 ,5, 7 ,8, 9, 6};
        System.out.println(max(arr));
    }
    static  int max(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
         if (arr[i]>max)
         {
             max=arr[i];
         }

        }
        return max;
    }
}
