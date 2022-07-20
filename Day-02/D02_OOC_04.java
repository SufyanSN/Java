package com.codewithsufyan;

import java.util.Scanner;

public class D02_OOC_04 {
    public static void main(String[] args) {
        Shape shape = new Square();
        System.out.println("Area = " + shape.calculateArea());

        shape = new Triangle();
        System.out.println("Area = " + shape.calculateArea());
    }
}

class Shape {
    Scanner scanner = new Scanner(System.in);
    double calculateArea() {
        return 0;
    }
}

class Square extends Shape {
    double calculateArea() {
        System.out.print("Enter side of squre : ");
        int side = scanner.nextInt();
        int area = side * side;

        return area;
    }
}

class Triangle extends Shape {
    double calculateArea() {
        System.out.print("Enter base of triangele :");
        int base = scanner.nextInt();
        System.out.print("Enter height of triangele :");
        int height = scanner.nextInt();

        double area = 0.5 * (base * height);
        return area;
    }
}

class Rectangle extends Shape {
    double calculateArea() {
        System.out.println("Enter length :");
        int length = scanner.nextInt();
        System.out.println("Enter length :");
        int breadth = scanner.nextInt();

        double area = length * breadth;

        return area;
    }
}
