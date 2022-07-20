package com.codewithsufyan;

import java.util.Scanner;

public class JH_Basics_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the basic amount :");
        int basic = scanner.nextInt();
        double bonus = 0;

        if (basic > 20000) {
            bonus = (basic * 0.17) + 1500;
            System.out.println("Bonus is : " + bonus);
        }
        else if (basic>15000 && basic<=20000) {
            bonus = (basic * 0.15) + 1200;
            System.out.println("Bonus is : " + bonus);
        }
        else if (basic>10000 && basic<=15000) {
            bonus = (basic * 0.12) + 1000;
            System.out.println("Bonus is : " + bonus);
        }
        else {
            bonus = (basic * 0.08) + 500;
            System.out.println("Bonus is : " + bonus);
        }
    }
}
