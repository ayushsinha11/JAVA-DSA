package Arrays;

import java.util.HashSet;

public class repeating {
    public static void main(String[] args) {
        int []arr={3,4,5,1,6,7,8 ,9,10,};

        System.out.println(repeat(arr));
        System.out.println(sum(arr));
    }
    static int repeat(int[]arr ){
        HashSet<Integer> num=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (num.contains(arr[i]))
                return arr[i];
            num.add(arr[i]);
        }
       return -1;
    }
    static int sum(int[] arr){
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        for (int i = 0; i < arr.length ; i++) {
            sum=sum-arr[i];
        }
        return sum;
    }
}
