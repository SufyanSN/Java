/*
Write a program to read a string and a positive integer n as input and construct a string with first n and last n characters in the given string.
 */

package com.codewithsufyan;

import java.util.Scanner;

public class D03_Strings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string :");
        String s1 = scanner.nextLine();
        System.out.print("Enter a number :");
        int n = scanner.nextInt();

        if (s1.length() < n){
            System.out.println("String is too short");
        }
        else{
            System.out.println(s1.substring(0,n) + s1.substring((s1.length()-n),s1.length()));
        }
    }
}
