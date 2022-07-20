package com.codewithsufyan;

import java.util.Scanner;

public class JH_Statement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :");
        int input = scanner.nextInt();

        int res = sumOfOddDig(input);
        System.out.println("Sum of odd digits = " + res);
    }

    static int sumOfOddDig(int num) {
        int sum = 0;
        int reminder;

        while (num != 0) {
            reminder = num % 10;

            if (reminder%2 != 0) {
                sum = sum + reminder;
            }
            num = num /10;
        }
        return sum;
    }
}
