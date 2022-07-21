/*
Write a program to read a string from the user and remove all the alphabets and spaces from the String,
and only store special characters and digit in the output String. Print the output string
 */

package com.codewithsufyan;

import java.util.Scanner;

public class D03_Strings_05 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String :");
        String str = scanner.nextLine();

        StringBuffer alphabet = new StringBuffer();
        StringBuffer number = new StringBuffer();
        StringBuffer whitespace = new StringBuffer();
        StringBuffer special = new StringBuffer();

        for (int i=0; i<str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
                number.append(str.charAt(i));
            else if(Character.isAlphabetic(str.charAt(i)))
                alphabet.append(str.charAt(i));
            else if (Character.isWhitespace(str.charAt(i))) {
                whitespace.append(str.charAt(i));
            } else
                special.append(str.charAt(i));
        }
        System.out.println(special);
    }
}
