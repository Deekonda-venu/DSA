package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P13LCM {
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

        if (a == 0 || b == 0) {
            System.out.println(0);
            return;
        }

        long g = gcd(a, b);
        long lcm = Math.abs(a / g * b);
        System.out.println(lcm);
    }
}
