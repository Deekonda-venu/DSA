package Fundamentals.Basics.CheckEvenorOdd;

import java.math.BigInteger;
import java.util.Scanner;

public class P32BinomialCoefficient {
    private static BigInteger binomial(int n, int k) {
        if (k < 0 || k > n) {
            return BigInteger.ZERO;
        }
        k = Math.min(k, n - k);
        BigInteger res = BigInteger.ONE;
        for (int i = 1; i <= k; i++) {
            res = res.multiply(BigInteger.valueOf(n - k + i));
            res = res.divide(BigInteger.valueOf(i));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(binomial(n, k));
    }
}
