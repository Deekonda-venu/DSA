package Fundamentals.Basics.CheckEvenorOdd;

import java.util.Scanner;

public class p34Allprimenumners {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2; i<=n; i++){
            int sum=0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    sum = sum + 1;
                }
            }
            if(sum==2){
                System.out.println(i);
            }
        }
    }
}
