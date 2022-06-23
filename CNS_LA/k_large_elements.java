package CNS_LA;
import java.util.PriorityQueue;

public class k_large_elements {
    public static void main(String[] args) {

        int []arr={7,10,4,3,20,15};
        int res=large(arr,3);
       //System.out.println(res);;

    }
    static int large(int [] arr, int k){

        PriorityQueue<Integer>max=new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            max.add(arr[i]);
            if (max.size()>k)
            {
                max.poll();
            }
        }
        while(max.size()>0){
            System.out.println(max.poll());
         }
        return -1;


    }
}
