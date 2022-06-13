package Arrays;

import java.util.HashSet;

public class hashbrown {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(2);
      h.add(50); //containsa means pehle se wo present h hashset me.
        h.add(4);
        h.add(6);
        h.add(10);
        h.remove(2);
        System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.contains(50));
        System.out.println(h.isEmpty());
    }
}
