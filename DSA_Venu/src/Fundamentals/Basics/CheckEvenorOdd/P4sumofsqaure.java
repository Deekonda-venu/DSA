package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class P4sumofsqaure {
    static public int sumof(int n){
        int sum =0;
        for(int i=1; i<=n; i++){
            sum = sum + i*i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumof(n);
        System.out.println(sum);

    }
}
