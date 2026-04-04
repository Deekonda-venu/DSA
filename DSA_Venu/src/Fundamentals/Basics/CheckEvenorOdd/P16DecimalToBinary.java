package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P16DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        long x = n;
        boolean negative = x < 0;
        if (negative) {
            x = -x;
        }

        StringBuilder sb = new StringBuilder();
        while (x > 0) {
            sb.append(x % 2);
            x /= 2;
        }
        sb.reverse();

        if (negative) {
            System.out.println("-" + sb);
        } else {
            System.out.println(sb);
        }
    }
}
