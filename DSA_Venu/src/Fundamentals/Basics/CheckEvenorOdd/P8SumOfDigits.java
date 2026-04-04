package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P8SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long x = Math.abs(n);
        long sum = 0;
        while (x > 0) {
            sum += (x % 10);
            x /= 10;
        }

        System.out.println(sum);
    }
}
