package oops;

public class mainclass {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.age=21;
        p1.name="Ayush";
        System.out.println(p1.name + " "+p1.age);
        Person p2=new Person();
        p2.name="Sinha";
        p1.eat();
        p2.walk();
        p1.walk(5);
    }

}
class Person{
    String name;
    int age;
    void walk(){
        System.out.println(name +" "+ "is walking");
    }
    void eat(){
        System.out.println(name +" "+ "Is eating");
    }
    void walk(int steps){ // function with arguments.
        System.out.println(name +" "+"walked"+ " "+ steps+ " "+"steps");
    }
}
