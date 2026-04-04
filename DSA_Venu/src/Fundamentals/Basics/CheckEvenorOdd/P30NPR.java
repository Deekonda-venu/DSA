package Fundamentals.Basics.CheckEvenorOdd;

import java.math.BigInteger;
import java.util.Scanner;

public class P30NPR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        if (r < 0 || r > n) {
            System.out.println(0);
            return;
        }

        BigInteger res = BigInteger.ONE;
        for (int i = 0; i < r; i++) {
            res = res.multiply(BigInteger.valueOf(n - i));
        }

        System.out.println(res);
    }
}
