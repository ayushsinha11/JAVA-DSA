package Recursion;

public class digitproduct {
    public static void main(String[] args) {
        int ans=pdt(123);
        System.out.println(ans);
    }
    static int pdt(int n){
        if (n%10==n){
            return n;
        }
        return  (n%10)*pdt(n/10);
    }
}
