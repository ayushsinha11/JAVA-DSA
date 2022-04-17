package Searching;

public class evendigits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findnumber(nums));
    }
    static int findnumber(int[] nums){
        int count =0;
        for(int num:nums){ //for every number in nums.
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num)
    {
        int numberofdigits=digits(num);
        if(numberofdigits %2==0){

        }
        return numberofdigits %2==0;
    }
    static int digits(int num){
        int count =0;
        while(num>0){
            count ++;
            num=num/10;
        }
        return count;
    }
}
