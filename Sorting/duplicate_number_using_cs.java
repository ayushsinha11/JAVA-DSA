package Sorting;

public class duplicate_number_using_cs {
    public static void main(String[] args) {
            int []arr={1,3,4,2,2};
            dup(arr);
        System.out.println(dup(arr));
    }
    static int dup(int[] arr){
        int i=0;
        while(i< arr.length){
            if(arr[i]!=i+1){ //if element is not equal to index +1
                int correct=arr[i]-1;
                if (arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }
                else {
                    return arr[i];
                }

            }
            else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int []arr,int   start,int   end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}