/*
Write a program that performs the following actions:
    Read n strings as input.
    Create an arraylist to store the above n strings in this arraylist.
    Write a function convertToStringArray which accepts the arraylist as input.
    The function should sort the elements (strings) present in the arraylist and convert them into a string array.
    Return the array.
 */

package com.codewithsufyan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D04_Collections_03 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Length :");
        int length = scanner.nextInt();

        for (int i = 0; i < length; i++) {
            System.out.println("Enter string :");
            String str = scanner.next();
            list.add(str);
        }

        System.out.println("Before Sorting : "+list);

        D04_Collections_03.convertToStringArray(list);
    }

    static void convertToStringArray(ArrayList list) {
        Collections.sort(list);
        System.out.println("After Sorting : "+list);
    }
}
