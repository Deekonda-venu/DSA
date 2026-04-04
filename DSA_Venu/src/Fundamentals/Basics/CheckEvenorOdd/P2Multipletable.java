package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P2Multipletable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            int n1 = i*n;
            System.out.println(n + " * "+ i + " = " +n1);
        }
    }
}
