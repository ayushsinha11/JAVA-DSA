package Searching;
import java.util.Scanner;
public class stringsearch {
    public static void main(String[] args) {
        String name = "AYUSH";
        char target = 'U';
        System.out.println(linear(name, target));
    }
    static boolean linear(String str,char  target){
        if (str.length()==0)
            return false;
        for (int i = 0; i <str.length() ; i++) {

            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
