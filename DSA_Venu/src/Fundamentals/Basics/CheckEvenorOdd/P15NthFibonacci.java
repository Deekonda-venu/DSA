package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P15NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(0);
            return;
        }
        if (n == 2) {
            System.out.println(1);
            return;
        }

        long a = 0;
        long b = 1;
        for (int i = 3; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }

        System.out.println(b);
    }
}
