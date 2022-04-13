package com.ayush;

import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empid=in.nextInt();
        String department=in.next();
        switch (empid){
            case 1:
                System.out.println("Employee number is 1");
                break;
            case 2:
                System.out.println("Employee id is 2");
                break;
            case 3:
                System.out.println("Employee number is 3");
                switch (department) {
                    case "IT" -> System.out.println("Department is It");
                    case "Mgmt" -> System.out.println("Department is Management");
                    default -> System.out.println("Enter valid department name");
                }
            default:
                System.out.println("Enter valid empid");
        }

    }
}
