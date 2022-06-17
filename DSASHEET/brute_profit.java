package DSASHEET;

public class brute_profit {
    public static void main(String[] args) {
        int[]arr={7,1,5,3,6,4};
        System.out.println(profit(arr));
    }
    static int profit(int[]arr){
        int maxprice=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                int x=arr[j]-arr[i];
                if (x>maxprice)
                    maxprice=x;
            }
        }
        return maxprice;
    }
}
