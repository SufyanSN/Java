package com.codewithsufyan;

import java.util.Scanner;

public class JH_Statement_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit :");
        int N = scanner.nextInt();

        int sum = 0;
        int count = 0;

        for(int i=5;i<=N; i=i+5) {
            sum = sum + i;
            count = count + 1;
        }
        System.out.println(sum);
        float avg = (float)sum / (float)count;
        System.out.println(avg);
    }
}
