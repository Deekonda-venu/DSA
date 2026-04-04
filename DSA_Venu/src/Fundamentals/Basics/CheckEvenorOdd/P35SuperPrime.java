package Fundamentals.Basics.CheckEvenorOdd;

import java.util.ArrayList;
import java.util.Scanner;

public class P35SuperPrime {
    int x;
    P35SuperPrime(int x) {
        this.x = x;
    }
    P35SuperPrime() {
//        this.x = x;
    }

    static public ArrayList<Integer> prime(P35SuperPrime p){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2; i<= p.x; i++){
            int sum = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    sum=sum+1;

                }
            }
            if(sum==2){
                list.add(i);
            }
        }
        System.out.println(list);

        return list;
    }
    static public ArrayList<Integer> superPrime(int n){
        ArrayList<Integer> list1 = new ArrayList<>();
        P35SuperPrime p = new P35SuperPrime(n);
        ArrayList<Integer> list2 = prime(p);
        int size = list2.size();
        System.out.println(size);
        for(int i=1; i<=list2.size(); i++){
            int sum=0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    sum=sum+1;
                }
            }
            if(sum==2){
                list1.add(list2.get(i-1));
            }
        }
        return list1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list3=superPrime(n);
        System.out.println(list3);


    }
}
