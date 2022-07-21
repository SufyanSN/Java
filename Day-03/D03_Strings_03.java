/*
Read a string as input and remove vowels from even position in the string.
 */

package com.codewithsufyan;

import java.util.Scanner;

public class D03_Strings_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String :");
        String s1 = scanner.nextLine();
        StringBuilder sb = new StringBuilder(s1);

        String res = "";
        for (int i=0;i<sb.length();i++) {
            if (i%2 == 0) {
                if (sb.charAt(i) != 'a' && sb.charAt(i) != 'A' && sb.charAt(i) != 'e' && sb.charAt(i) != 'E' && sb.charAt(i) != 'i' && sb.charAt(i) != 'I' && sb.charAt(i) != 'o' && sb.charAt(i) != 'O' && sb.charAt(i) != 'u' && sb.charAt(i) != 'U') {
                    res = res + s1.charAt(i);
                    //sb.deleteCharAt(i);
                }
            }
            else {
                     {
                        res = res + s1.charAt(i);
                    }
            }
        }
        System.out.println(res);
    }
}
