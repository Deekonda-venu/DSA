package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class java {
    static public boolean evenornot(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(evenornot(n)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
