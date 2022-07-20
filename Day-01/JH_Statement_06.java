package com.codewithsufyan;

import java.util.Scanner;

public class JH_Statement_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number :");
        int num = scanner.nextInt();

        int sumOfPerfect = 0;

        for (int i = 1; i < num; i++) {
            if ((num%i) == 0) {
                sumOfPerfect = sumOfPerfect + i;
            }
        }
        if (sumOfPerfect == num) {
            System.out.println(num + " is a perfect number.");
        }else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
