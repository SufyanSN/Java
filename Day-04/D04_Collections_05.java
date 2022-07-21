/*
Write a program to read two int array lists of size 5 each as input and to merge the two arrayLists,
 sort the merged arraylist in ascending order and fetch the elements at 2nd, 6th and 8th index into a new arrayList and return the final ArrayList.
 */

package com.codewithsufyan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class D04_Collections_05 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list_02 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int num;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number in 1st list:");
            num = scanner.nextInt();
            list.add(num);
        }
        System.out.println("list-1 :"+list);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number in 2nd list:");
            num = scanner.nextInt();
            list_02.add(num);
        }
        System.out.println("list-2 :"+list_02);

        list.addAll(list_02);
        System.out.println("Appended list :"+list);
        Collections.sort(list);
        System.out.println("Sorted list :"+list);
        System.out.println("Element at index-2 :"+list.get(2));
        System.out.println("Element at index-6 :"+list.get(6));
        System.out.println("Element at index-8 :"+list.get(8));
    }
}
