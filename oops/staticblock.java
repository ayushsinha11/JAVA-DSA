package oops;
public class staticblock {
    static int a=4;
    static int b;

    static{
        System.out.println("I'm in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        staticblock obj=new staticblock();
        System.out.println(staticblock.a+" "+staticblock.b);
    }
}
