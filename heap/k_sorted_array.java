package heap;
import java.util.*;
import java.util.PriorityQueue;

public class k_sorted_array {
    public static void main(String[] args) {
        int[]arr={7,10,4,3,20,15};
        search(arr,3);

    }
    static void search(int []arr,int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
           pq.add(arr[i]);
        }
        if (pq.size()>k) {

            System.out.println(pq.poll());
        }
        while(pq.size()>0)
        {

            System.out.println(pq.poll());
        }
    }
}
