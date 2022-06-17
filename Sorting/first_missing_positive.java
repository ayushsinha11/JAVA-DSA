package Sorting;

public class first_missing_positive {
    public static void main(String[] args) {

    }
    static int sort(int[] arr) {
        int i = 0;
        while (i < arr.length) { // in this while loop we are just sorting the elements using the cyclic sort concept.
            int correct_index = arr[i]-1;
            if (arr[i]>0&&arr[i]<= arr.length && arr[i] != arr[correct_index])
                swap(arr, i, correct_index);
            else
                i++;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index+1)
                return index; //case 1
        }
        return arr.length+1;// case 2.
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
