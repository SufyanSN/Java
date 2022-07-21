/*
Write a program to read a string and return a modified string based on the following rules.
Return the String without the first 2 chars except when
1.	keep the first char if it is 'j'
2.	keep the second char if it is 'b'.
 */

package com.codewithsufyan;

import java.util.Scanner;

public class D04_Collections_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string:");
        String str = scanner.nextLine();

        if (str.charAt(0) == 'j' || str.charAt(0) == 'J'){
            str = str.substring(0,1)+str.substring(2,str.length());
        } else if (str.charAt(1) == 'b') {
            str = str.substring(1,str.length());
        }
        else {
            str = str.substring(2,str.length());
        }
        System.out.println(str);
    }
}
