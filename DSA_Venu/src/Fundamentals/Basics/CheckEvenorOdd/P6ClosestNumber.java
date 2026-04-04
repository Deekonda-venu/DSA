package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P6ClosestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int lower = Math.floorDiv(n, 10) * 10;
        int upper = lower + 10;

        int dLower = Math.abs(n - lower);
        int dUpper = Math.abs(upper - n);

        int ans = (dLower < dUpper) ? lower : upper;
        System.out.println(ans);
    }
}
