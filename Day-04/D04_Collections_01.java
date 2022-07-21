/*
Write a program that construts a hashmap with “state” as key and “capital” as its value. If the next input is a state, then it should return capital$state in lowercase.
Include a class  with a static method getCapital which accepts a hashmap. The return type is the string as given in the above statement
Create a Class Main which would be used to accept Input string and call the static method .
 */

package com.codewithsufyan;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class D04_Collections_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String state,capital;
        System.out.print("Enter Length :");
        int length = scanner.nextInt();

        Map<String,String> hashmap = new HashMap<>();

        for (int i=0;i<length;i++) {
            System.out.print("Enter State : ");
            state = scanner.next();
            System.out.print("Enter capital : ");
            capital = scanner.next();

            hashmap.put(state,capital);
        }

        System.out.println(hashmap);
        System.out.println("RESULT = "+D04_Collections_01.getCapital(hashmap));
    }

    static String getCapital(Map map) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a state to get the capital :");
        String state = scanner1.next();

        String res="";

        if (map.containsKey(state)) {
            String capital = (String)map.get(state);
            res = state + "$" + (String)map.get(state);

        }
        else {
            res = "No entry found";
        }
        return res.toLowerCase(Locale.ROOT);
    }
}
