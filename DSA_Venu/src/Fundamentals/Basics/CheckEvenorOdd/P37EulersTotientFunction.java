package Fundamentals.Basics.CheckEvenorOdd;

import java.util.ArrayList;
import java.util.Scanner;

public class P37EulersTotientFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=1; i<n; i++){
            if(n%i!=0){
                list.add(i);
                count++;
            }
        }
        System.out.println(count);
        System.out.println(list);
    }
}
