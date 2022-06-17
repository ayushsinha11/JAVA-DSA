package Sorting;

public class missing_no_cs {
    public static void main(String[] args) {
        int []arr={3,0,1};
        sort(arr);
        System.out.println(sort(arr));
    }

    static int sort(int[] arr) {
        int i = 0;
        while (i < arr.length) { // in this while loop we are just sorting the elements using the cyclic sort concept.
            int correct_index = arr[i];
            if (arr[i]< arr.length && arr[i] != arr[correct_index])
                swap(arr, i, correct_index);
            else
                i++;
        }
        //now after searching we will apply another for loop just to match the index with the elements
        //if the index matches with the elements then it's fine else when the index doesn't match with the element
        //we will return the index coz that's the missing number.
        //ex-at 0th index 0 is present at 1st index 1 is present at 2nd index 2 is present BUT ,at 3rd index 4 is present
        //so this means 3 is the missing number. hence we will return 3. condition if(arr[i]!=i) then return i.
        //similarly case 2 is if all the elements are present and N(i.e.the last index ) is missing in the array.
        //then N is the missing number hence we will return it.
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index)
                return index; //case 1
        }
            return arr.length;// case 2.
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}