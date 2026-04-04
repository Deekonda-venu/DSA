package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P18PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long x = Math.abs(n);
        long rev = 0;
        long t = x;
        while (t > 0) {
            rev = rev * 10 + (t % 10);
            t /= 10;
        }

        System.out.println(rev == x ? "Palindrome" : "Not Palindrome");
    }
}
