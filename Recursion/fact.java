package Recursion;

public class fact {
    public static void main(String[] args) {
        int ans=fac(5);
        System.out.println(ans);
    }
    static int fac(int n){
        if (n<=1){
            return 1;
        }
        return n*fac(n-1);
    }
}
