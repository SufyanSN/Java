package com.codewithsufyan;

public class JH_Statement_07 {
    public static void main(String[] args) {
        Differance d1 = new Differance();

        d1.diff(10);
    }
}

class Differance{
    static long sumOfSquares(int num) {
        long sum = 0 ;
        for(int i=1;i<=num;i++) {
            sum = sum + i*i;
        }
        return sum;
    }

    static long squareOfSum(int num) {
        long sum=0;
        for(int i=1;i<=num;i++) {
            sum = sum + i;
        }
        long square = sum * sum;

        return square;
    }

    void diff(int num) {
        long difference = Differance.sumOfSquares(num) - Differance.squareOfSum(num);
        System.out.println("Difference = " + difference);
    }
}
