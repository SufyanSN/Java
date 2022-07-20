package com.codewithsufyan;

import java.util.Scanner;

public class JH_Basics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the actual fees :");
        double fees = scanner.nextDouble();
        System.out.print("Please enter the students marks (out of 100) :");
        int marks = scanner.nextInt();

        if (marks > 90) {
            fees = fees - (0.5 * fees);
            System.out.println(fees);
        } else if (marks>80 && marks <=90) {
            fees = fees - (0.25 * fees);
            System.out.println(fees);
        } else if (marks>70 && marks<=80) {
            fees = fees - (0.1 * fees);
            System.out.println(fees);
        } else if (marks<=70) {
            fees = fees - (0);
            System.out.println(fees);
        }
    }
}
