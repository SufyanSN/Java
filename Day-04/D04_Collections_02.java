/*
Write a program that construts a hashmap and returns the value corresponding to the largest key.
 */

package com.codewithsufyan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D04_Collections_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key;
        String value;

        System.out.print("Enter Length :");
        int length = scanner.nextInt();

        Map<Integer,String> hashmap = new HashMap<>();

        for (int i=0;i<length;i++) {
            System.out.print("Enter an integer : ");
            key = scanner.nextInt();
            System.out.print("Enter string : ");
            value = scanner.next();

            hashmap.put(key,value);
        }
        System.out.println(hashmap);

        int max=0;
        for (int i: hashmap.keySet()){
            max = i;
        }
        System.out.println("Value corresponding to the largest key : "+ hashmap.get(max));
    }
}