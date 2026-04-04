package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P19DigitRoot {
    private static long digitRoot(long n) {
        long x = Math.abs(n);
        while (x >= 10) {
            long sum = 0;
            while (x > 0) {
                sum += (x % 10);
                x /= 10;
            }
            x = sum;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(digitRoot(n));
    }
}
