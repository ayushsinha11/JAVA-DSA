package Functions;

public class Methodoverloading {
    public static void main(String[] args) {
        fun(9);
        fun("AYUSH");
    }
     static void fun(int a){
         System.out.println(a);
     }
     static void fun(String name){
         System.out.println(name);
     }
}
