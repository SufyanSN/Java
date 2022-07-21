/*
Write a program to input a String array. The input may contain digits and alphabets (“de5g4G7R”).
Extract odd digits from each string and find the sum and print the output.
For example, if the string is "AKj375A" then take 3+7+5=15 and not as 375 as digit.
 */

package com.codewithsufyan;

import java.util.Scanner;

public class D03_Strings_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of String array :");
        int str1 = scanner.nextInt();
        String[] str2 = new String[str1];
        for (int i = 0; i < str1; i++) {
            System.out.print("Enter String :");
            str2[i] = scanner.next();
        }
        System.out.println("Sum of odd digits in strings = "+getOddSum(str2));
    }

    public static int getOddSum(String[] s1) {
        int sum = 0;
        for (int i = 0; i < s1.length; i++)
            for (int j = 0; j < s1[i].length(); j++) {
                char ch = s1[i].charAt(j);
                if (Character.isDigit(ch)) {
                    if (ch % 2 != 0) {
                        String t = String.valueOf(ch);
                        int n = Integer.parseInt(t);
                        sum = sum + n;
                    }
                }
            }
        return sum;
    }
}
