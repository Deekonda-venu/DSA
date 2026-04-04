package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P21TriangularNthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = n * (n + 1) / 2;
        System.out.println(ans);
    }
}
