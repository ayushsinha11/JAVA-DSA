package Recursion;

public class BS {
    public static void main(String[] args) {
    int []arr={1,3,7,9,11,77,89};
    int target=9;
        System.out.println(searching(arr,target,0, arr.length-1));
    }
    static int searching(int [] arr,int target,int s,int e){
        if(s>e) {
            return -1;
        }
        int m=s+(e-s)/2;
        if (target==arr[m])
            return m;
        if (arr[m]>target) {
            return searching(arr, target, s, m - 1);
        }
        else
               return searching(arr,target,m+1,e);
    }
}
