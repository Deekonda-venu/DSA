package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P28LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long x = Math.abs(n);
        if (x <= 1) {
            System.out.println(x);
            return;
        }

        long largest = -1;
        while (x % 2 == 0) {
            largest = 2;
            x /= 2;
        }
        for (long p = 3; p * p <= x; p += 2) {
            while (x % p == 0) {
                largest = p;
                x /= p;
            }
        }
        if (x > 1) {
            largest = x;
        }

        System.out.println(largest);
    }
}
