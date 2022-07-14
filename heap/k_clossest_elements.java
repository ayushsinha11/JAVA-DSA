package heap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class k_clossest_elements {
    public static class Pair implements Comparable <Pair>{
        int val;
        int gap;
        Pair(){

        }
        Pair(int val,int gap ){
            this.val=val;
            this.gap=gap;
        }
        public int compareTo(Pair o){
            if (this.gap==o.gap){
                return this.val-o.gap;
            }
            else {
                return this.gap-o.gap;
            }
        }
    }
    public static ArrayList<Integer>findClosest(int[]arr,int k,int x){
        ArrayList<Integer>list=new ArrayList<>();
        PriorityQueue<Pair>pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length ; i++) {
            if (pq.size()<k){
                pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
            }
            else {
                if (pq.peek().gap>Math.abs(arr[i]-x)){
                    pq.remove();
                    pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
                }
            }

        }

        return null;
    }
    public static void main(String[] args) {

    }
}
