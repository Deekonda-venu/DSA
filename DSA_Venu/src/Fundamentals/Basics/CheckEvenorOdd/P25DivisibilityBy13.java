package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P25DivisibilityBy13 {
    private static boolean isDivisibleBy13(String s) {
        int mod = 0;
        int i = 0;
        if (s.startsWith("-")) {
            i = 1;
        }
        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                continue;
            }
            mod = (mod * 10 + (c - '0')) % 13;
        }
        return mod == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isDivisibleBy13(s) ? "Yes" : "No");
    }
}
