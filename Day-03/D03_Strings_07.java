/*
Given a string array (s) and non negative integer (N) and return the number of elements in the array which have same number of characters as the givent int N.
 */

package com.codewithsufyan;

import java.util.Scanner;

public class D03_Strings_07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] s1 = {"Hello World","HI","Hello"};
        System.out.println("Array of Strings is :");
        for (String str:s1){
            System.out.println(str);
        }

        System.out.print("Enter a non-negative integer :");
        int N = scanner.nextInt();
        int count = 0;

        for (String str:s1){
            int length = str.length();
            if (length == N) {
                count++;
            }
        }

        System.out.println("\n");
        System.out.println("Number of elements in the array which have same number of characters as the given int N is : " + count);
    }
}
