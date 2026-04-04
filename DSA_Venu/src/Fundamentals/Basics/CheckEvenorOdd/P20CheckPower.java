package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P20CheckPower {
    private static boolean isPower(long n, long x) {
        if (x == 0) {
            return n == 0;
        }
        if (x == 1) {
            return n == 1;
        }
        if (x == -1) {
            return n == 1 || n == -1;
        }
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }

        long a = n;
        while (a % x == 0) {
            a /= x;
        }
        return a == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = sc.nextLong();
        System.out.println(isPower(n, x) ? "Yes" : "No");
    }
}
