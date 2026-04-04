package Fundamentals.Basics.CheckEvenorOdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P27PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long x = Math.abs(n);
        List<Long> factors = new ArrayList<>();

        while (x % 2 == 0 && x > 0) {
            factors.add(2L);
            x /= 2;
        }
        for (long p = 3; p * p <= x; p += 2) {
            while (x % p == 0) {
                factors.add(p);
                x /= p;
            }
        }
        if (x > 1) {
            factors.add(x);
        }

        if (factors.isEmpty()) {
            System.out.println(n);
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < factors.size(); i++) {
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(factors.get(i));
        }
        System.out.println(sb);
    }
}
