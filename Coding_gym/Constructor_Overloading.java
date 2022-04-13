package Coding_gym;

class Area1 {
    int length=2,breadth=5;

    Area1()
    {
        System.out.println("This a default constructor");
        int area = length*breadth;
        System.out.println("Area of Rectangle is : "+area);
    }

    Area1(int l, int b)
    {
        length=l;
        breadth=b;
        System.out.println("This a Parameterized Constructor");
        int area = length*breadth;
        System.out.println("Area of Rectangle is : "+area);
    }
}

public class Constructor_Overloading {
    public static void main(String[] args) {

       // System.out.println("\nDefault Constructor values : \nLength : 2 and Breadth : 5");
        Area1 A1=new Area1();
        Area1 A2=new Area1(5,10);

       // A1.show();
     //   A2.show(3,5);
    }
}
