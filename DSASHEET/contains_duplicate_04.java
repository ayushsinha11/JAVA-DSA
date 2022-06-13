package DSASHEET;

import java.util.HashSet;

public class contains_duplicate_04 {
    public static void main(String[] args) {
        int [] arr={1,2,3,1};
        System.out.println(containsDup(arr));

    }
    static  boolean containsDup(int [] arr){
        HashSet<Integer> numbers=new HashSet<>();
        for (int i = 0; i < arr.length ; i++) {
            if (numbers.contains(arr[i]))
                return true;
            numbers.add(arr[i]);

        }
        return false;
    }
}
