/*
Write a program to read a string containing multiple words find the first and last words,
if they are same, return the length and if not return the sum of length of the two words.
 */

package com.codewithsufyan;

import java.util.Scanner;

public class D03_Strings_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string :");
        String str = scanner.nextLine();

        String[] str_arr = str.split(" ");

        int len_str_arr = str_arr.length;
        if (str_arr[0].equalsIgnoreCase(str_arr[len_str_arr-1])){
            System.out.println("Length = " + str_arr[0].length());
        }
        else {
            int len = str_arr[0].length() + str_arr[len_str_arr-1].length();
            System.out.println("Length = " + len);
        }
    }
}
