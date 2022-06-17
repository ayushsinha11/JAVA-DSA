package DSASHEET;
public class repeaatandmissingnumberarray_09 {
    public static void main(String[] args) {

    }

    static int[] sort(int[] arr) {
        int i = 0;
        while (i < arr.length) { // in this while loop we are just sorting the elements using the cyclic sort concept.
            int correct_index = arr[i]-1;
            if (arr[i] < arr.length && arr[i] != arr[correct_index])
                swap(arr, i, correct_index);
            else
                i++;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index+1){
                return new int[] {arr[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}