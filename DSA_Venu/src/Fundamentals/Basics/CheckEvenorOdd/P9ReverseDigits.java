package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P9ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long sign = n < 0 ? -1 : 1;
        long x = Math.abs(n);

        long rev = 0;
        while (x > 0) {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }

        System.out.println(sign * rev);
    }
}
