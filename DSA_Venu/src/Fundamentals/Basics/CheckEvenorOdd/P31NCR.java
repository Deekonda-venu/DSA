package Fundamentals.Basics.CheckEvenorOdd;

import java.math.BigInteger;
import java.util.Scanner;

public class P31NCR {
    private static BigInteger nCr(int n, int r) {
        if (r < 0 || r > n) {
            return BigInteger.ZERO;
        }
        r = Math.min(r, n - r);
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= r; i++) {
            res = res.multiply(BigInteger.valueOf(n - r + i));
            res = res.divide(BigInteger.valueOf(i));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(nCr(n, r));
    }
}
