package oops;

public class begin {
    public static void main(String[] args) {
        Student ayush=new Student();
        System.out.println(ayush.name);
        System.out.println(ayush.marks);
        System.out.println(ayush.roll_no);


        Student arpit=new Student(36,"Arpit",89.97);
        System.out.println(arpit.marks);

        Student xyz=new Student();
        xyz.name="pinku";
        System.out.println(xyz.name);
        System.out.println(xyz.marks);
        System.out.println(xyz.roll_no);

    }
}
class Student{
    int roll_no;
    String name;
    double marks;

    Student(){
        this.roll_no=11;
        this.name="Ayush Sinha";
        this.marks=99.97;
    }

    Student(int roll_no,String name,double marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }




}
