package com.codewithsufyan;

import java.util.Scanner;

public class JH_Basics_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the salary:");
        int salary = scanner.nextInt();
        System.out.print("Enter the number of shifts :");
        int shifts = scanner.nextInt();

        double savings;

        savings = salary - (0.5 * salary) + (shifts * (0.02 * salary));

        System.out.println(savings);
    }
}
