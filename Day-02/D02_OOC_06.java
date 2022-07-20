package com.codewithsufyan;

import java.util.Scanner;

public class D02_OOC_06 {
    public static void main(String[] Args) {
        int n;
        int i=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of products :");
        n=scanner.nextInt();

        Product product[];
        product = new Product[n];

        int choice=0;

        while (choice != 4) {
            System.out.println("1. Add a new product");
            System.out.println("2. Search for a product");
            System.out.println("3. Display product details");
            System.out.println("4. Quit");
            System.out.print("Enter an option :");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (i < n) {
                        product[i] = new Product();

                        product[i].setProductName("Product-" + i);
                        System.out.println("Enter product price :");
                        int price = scanner.nextInt();
                        product[i].setPrice(price);
                        product[i].setProductCode(i);

                        System.out.println("Product added , code = " + i);
                        i++;
                    }

                    else {
                        System.out.println("Product addition not possible.");
                    }
                    break;
                case 2:
                    System.out.println("Enter Product Code to search:");
                    int pc=scanner.nextInt();

                    if (pc<n){
                        System.out.println("Product found :");
                        System.out.println("Name :"+product[pc].getProductName());
                        System.out.println("price :" +product[pc].getPrice());
                        System.out.println("Product code :" +product[pc].getProductCode());
                    }
                    else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter Product Code :");
                    int pc1=scanner.nextInt();

                    if (pc1<n) {
                        System.out.println("Product details :");

                        System.out.println("Name :"+product[pc1].getProductName());
                        System.out.println("price :" +product[pc1].getPrice());
                        System.out.println("Product code :"+product[pc1].getProductCode());
                    }
                    else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    System.exit(0);
            }

            System.out.println("\n");
        }
    }
}

class Product {
    int productCode;
    String productName;
    double price;

    public Product() {
    }

    public Product(int productCode, String productName, double price) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
