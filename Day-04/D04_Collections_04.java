/*
1.Read m strings as input (fruit names).
2.Create an arraylist to store the above m strings in this arraylist.
3.Read n strings as input (fruit names).
4.Create an arraylist to store the above n strings in this arraylist.
5.Write a function fruitSelector which accepts the arraylists as input.
6.Remove all fruits whose name ends with 'a' or 'e' from first arrayList and remove all fruits whose name begins  with 'm' or 'a' from second arrayList then combine the two lists and return the final output as a String array.
7.If the array is empty the program will print as “No fruit found”
 */

package com.codewithsufyan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D04_Collections_04 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list01 = list1;

        List<String> list2 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length-1:");
        int len1 = scanner.nextInt();
        System.out.println("Enter length-2:");
        int len2 = scanner.nextInt();

        String fruit;
        for (int i = 0; i < len1; i++) {
            System.out.println("Enter a fruit name for list-1:");
            fruit = scanner.next();
            list1.add(fruit);
        }
        System.out.println("List-1 :" + list1);

        for (int i = 0; i < len2; i++) {
            System.out.println("Enter a fruit name for list-2:");
            fruit = scanner.next();
            list2.add(fruit);
        }
        System.out.println("List-2 :" + list2);


        try {
            for (String str1:list1) {
                if (str1.charAt(str1.length()-1) == 'a' || str1.charAt(str1.length()-1) == 'A' || str1.charAt(str1.length()-1) == 'e' || str1.charAt(str1.length()-1) == 'E'){
                    list1.remove(str1);
                }
            }
            //System.out.println("List-1 :" + list1);
        }catch (Exception e){
            //System.out.println(e);
        }

        try {
            for (String str:list2) {
                if(str.charAt(0) == 'm' || str.charAt(0) == 'a') {
                    list2.remove(str);
                }
            }
        }catch (Exception e){
            //System.out.println(e);
        }
        //System.out.println(list2);
        list1.addAll(list2);
        if (list1.isEmpty()) {
            System.out.println("\n");
            System.out.println("Result = No fruit found");
        }else {
            System.out.println("\n");
            System.out.println("Result-list :" + list1);
        }
    }
}
