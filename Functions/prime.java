package Functions;
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class prime {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter  the number to be checked");
        int n=in.nextInt();
       boolean ans= isprime(n);
        System.out.println(ans);
    }
  static  boolean  isprime(int num){
        int i;
        for( i=2;i<=sqrt(num);i++);
         {
            if (num % i == 0)
                {
                     return false;
                }
            else
                return true;
        }
    }
}
