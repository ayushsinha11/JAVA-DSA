package DSASHEET;

public class maxandminelement {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
       // int[] arr = {};
         getminmax(arr);
       // System.out.println(getminmax(arr));
    }

    static int getminmax(int[] arr) {
        if (arr.length == 0)
            return -1;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            //min=arr[0];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j])
                    min = arr[j];
            }

        }
        System.out.println("Minimum element is"+" "+min);
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j])
                    max = arr[j];
            }
        }
        System.out.println("Maximum element is"+" "+max);
        return -1;
    }
}
