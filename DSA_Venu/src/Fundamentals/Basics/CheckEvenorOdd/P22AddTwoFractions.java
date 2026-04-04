package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P22AddTwoFractions {
    private static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long num = a * d + c * b;
        long den = b * d;

        long g = gcd(num, den);
        num /= g;
        den /= g;

        if (den < 0) {
            den = -den;
            num = -num;
        }

        System.out.println(num + " " + den);
    }
}
