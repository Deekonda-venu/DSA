package Fundamentals.Basics.CheckEvenorOdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P26AllFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        long x = Math.abs(n);
        List<Long> small = new ArrayList<>();
        List<Long> large = new ArrayList<>();

        for (long i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                small.add(i);
                long other = x / i;
                if (other != i) {
                    large.add(other);
                }
            }
        }

        Collections.reverse(large);
        StringBuilder sb = new StringBuilder();
        for (long v : small) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(v);
        }
        for (long v : large) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(v);
        }

        System.out.println(sb);
    }
}
