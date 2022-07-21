/*
Write code to get two strings as input and If strings are of same length simply append them together and return the final string.
If given strings are of different length, remove starting characters from the longer string so that both strings are of same length then append them together and return the final string.
 */

package com.codewithsufyan;

import java.util.Scanner;

public class D03_Strings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String-1 :");
        String s1 = scanner.nextLine();
        System.out.println("Enter String-2 :");
        String s2 = scanner.nextLine();

        if (s1.length() == s2.length()) {
            System.out.println(s1 + s2);
        }else if (s1.length() > s2.length())
        {
            int diff = s1.length() - s2.length();
            System.out.println(s1.substring(diff, s1.length()) + s2);
        }
        else{
            int diff = s2.length() - s1.length();
            System.out.println(s1 + s2.substring(diff, s2.length()));
        }
    }
}
