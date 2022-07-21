/*
Write a program to read a string and to test whether first and last character are same.
The string is said to be be valid if the 1st and last character are the same.
Else the string is said to be invalid.
 */



package com.codewithsufyan;

import java.util.Scanner;

public class D03_Strings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string :");
        String s1 = scanner.nextLine();
        System.out.println(s1);

        int length = s1.length();
        if (length<2) {
            System.out.println("Invalid String");
        } else if (s1.charAt(0) == s1.charAt(length-1)) {
            System.out.println("Valid String");
            System.out.println("First and last char are same");
        }
        else {
            System.out.println("Invalid String");
            System.out.println("First and last char are not same");
        }
    }
}
