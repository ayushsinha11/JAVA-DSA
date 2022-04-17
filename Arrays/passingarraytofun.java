package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class passingarraytofun {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] num={5,10,15,20,25};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] arr){
        arr[2]=37;
        //System.out.println(Arrays.toString(arr));
    }
}
