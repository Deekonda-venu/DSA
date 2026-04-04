package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P29ModularExponentiation {
    private static long modPow(long a, long b, long mod) {
        if (mod == 1) {
            return 0;
        }
        long base = ((a % mod) + mod) % mod;
        long exp = b;
        long res = 1 % mod;
        while (exp > 0) {
            if ((exp & 1L) == 1L) {
                res = (res * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long m = sc.nextLong();
        System.out.println(modPow(a, b, m));
    }
}
