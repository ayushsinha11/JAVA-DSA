package DSASHEET;

public class best_time_to_buy_sell_07 {
    public static void main(String[] args) {
        int[]arr={7,1,5,3,6,4};
        System.out.println(profit(arr));

    }
    static int profit(int[] arr){
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<minprice)
                minprice=arr[i];
            else if (arr[i]-minprice>maxprofit) {//arr[i]-min means calculating the max profit,since the minprice is fixed and the value of i will kepp on
                                                    //increasing and thus we can calculate the max profit
                maxprofit=arr[i]-minprice;
            }
        }
        return maxprofit;
    }
}
