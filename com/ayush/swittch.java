package com.ayush;
import java.util.Scanner;
public class swittch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String fruit= in.next();
        switch (fruit) {
            case "Mango" -> System.out.println("Yellow in color");
            case "Apple" -> System.out.println("Red in colour");
            default -> System.out.println("Enter the valid fruit name");
        }
    }
}
