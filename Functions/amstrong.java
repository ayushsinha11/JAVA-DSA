package Functions;

import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number"+" ");
        int n=in.nextInt();
        boolean ans=isArmstrong(n);
        System.out.println(ans);


    }
    static boolean isArmstrong(int num){
        int original=num;
        int sum=0;
        while(num>0) {
       int rem = num % 10;
            sum = sum + rem*rem*rem;
            num=num/10;
        }
        return (original==sum);
//        if (original==sum)
//            return true;
//        else
//            return false;

    }

}
