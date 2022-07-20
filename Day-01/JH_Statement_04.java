package com.codewithsufyan;

import java.util.Scanner;

public class JH_Statement_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter : ");
        int num_of_numbers = scanner.nextInt();
        int pos_sum = 0;
        int neg_sum = 0;

        int input;
        for(int i=num_of_numbers;i>0;i=i-1) {
            System.out.print("Enter a number :");
            input = scanner.nextInt();
            if (input > 0){
                pos_sum = pos_sum + 1;
            } else if (input < 0) {
                neg_sum = neg_sum + 1;
            }
        }
        System.out.println("Positive numbers entered = " + pos_sum);
        System.out.println("Negative numbers entered  = " + neg_sum);
    }
}
