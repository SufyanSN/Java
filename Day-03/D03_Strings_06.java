/*
Given an array of Strings, write a program to take the last character of each string and make a new String by concatenating it.
 */

package com.codewithsufyan;

public class D03_Strings_06 {
    public static void main(String[] args) {
        String[] s1 = {"Hello World","HI","Hello"};

        String res="";

        System.out.println("Array of Strings is :");
        for (String str:s1){
            System.out.println(str);
            int length = str.length();
            res = res + str.charAt(length-1);
        }

        System.out.println("\n");
        System.out.println("Output = "+res);
    }
}
