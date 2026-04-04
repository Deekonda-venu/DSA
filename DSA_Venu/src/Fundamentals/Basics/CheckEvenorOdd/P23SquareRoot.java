package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P23SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n < 0) {
            System.out.println(0);
            return;
        }

        long r = (long) Math.sqrt(n);
        while ((r + 1) > 0 && (r + 1) * (r + 1) <= n) {
            r++;
        }
        while (r * r > n) {
            r--;
        }

        System.out.println(r);
    }
}
