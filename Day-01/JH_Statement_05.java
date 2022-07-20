package com.codewithsufyan;

import java.util.Scanner;

public class JH_Statement_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = scanner.nextInt();
        System.out.print("Enter m :");
        int m = scanner.nextInt();

        for(int i=1;i<=m;i++) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}
