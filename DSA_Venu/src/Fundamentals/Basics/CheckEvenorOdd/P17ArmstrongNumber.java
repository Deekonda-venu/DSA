package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P17ArmstrongNumber {
    private static int digits(long n) {
        if (n == 0) {
            return 1;
        }
        int d = 0;
        long x = n;
        while (x != 0) {
            d++;
            x /= 10;
        }
        return d;
    }

    private static long powInt(long base, int exp) {
        long res = 1;
        for (int i = 0; i < exp; i++) {
            res *= base;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long x = Math.abs(n);
        int d = digits(x);

        long sum = 0;
        long t = x;
        while (t > 0) {
            long digit = t % 10;
            sum += powInt(digit, d);
            t /= 10;
        }

        System.out.println(sum == x ? "Armstrong" : "Not Armstrong");
    }
}
