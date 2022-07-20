package com.codewithsufyan;

import java.util.Scanner;

class Car {
    int productDigits(int n) {
        int product = 1;

        while (n != 0) {
            product = product * (n % 10);
            n = n /10;
        }
        return product;
    }
}

public class JH_Statement_01 {
    public static void main(String[] args) {
        Car c1 = new Car();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        int res = c1.productDigits(num);
        System.out.println(res);
    }
}
