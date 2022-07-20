package com.codewithsufyan;

import java.util.Scanner;

public class JH_Basics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        for (int i = 0; i <5 ; i++) {
            System.out.print("Enter Marks :");
            int marks = scanner.nextInt();
            sum = sum + marks;
        }
        double average;

        average = sum/5;

        if (average >80) {
            System.out.println("First Grade University");
        } else if (average>60) {
            System.out.println("Second Grade University");
        }else {
            System.out.println("Third Grade University");
        }
    }
}
