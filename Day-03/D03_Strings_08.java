/*
Obtain two strings S1,S2 from user as input. Your program should form a string
of  “long+short+long”, with the shorter string inside of the longer String.
 */

package com.codewithsufyan;

import java.util.Scanner;

public class D03_Strings_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String-1 :");
        String s1 = scanner.nextLine();
        System.out.println("Enter String-2 :");
        String s2 = scanner.nextLine();

        if (s1.length() == s2.length()) {
            System.out.println("Enter Strings of different length.");
        }else if (s1.length() > s2.length())
        {
            System.out.println(s1+s2+s1);
        }
        else{
            System.out.println(s2+s1+s2);
        }
    }
}
