package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P14PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not Perfect");
            return;
        }

        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                int other = n / i;
                if (other != i) {
                    sum += other;
                }
            }
        }

        System.out.println(sum == n ? "Perfect" : "Not Perfect");
    }
}
