package DSASHEET;

public class max_min_aliter_two {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int max,min;
        if (arr[0]>arr[1]) {
            max = arr[0];
            min = arr[1];
        }else{
            max=arr[1];
            min=arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("min ="+" "+min);
        System.out.println("max="+" "+max);
    }
}
