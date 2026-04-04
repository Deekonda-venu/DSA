package Fundamentals.Basics.CheckEvenorOdd;

import java.util.ArrayList;
import java.util.Scanner;

public class P36Josephus_Problem {
    ArrayList<Integer> n;
    int k;
    P36Josephus_Problem(ArrayList<Integer> n, int k){
        this.n = n;
        this.k = k;
    }

    static public int josephus(P36Josephus_Problem p){
        if (p == null || p.n == null || p.n.isEmpty() || p.k <= 0) {
            return -1;
        }

        int idx = 0;
        while (p.n.size() > 1) {
            idx = (idx + p.k - 1) % p.n.size();
            p.n.remove(idx);
        }
        return p.n.get(0);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cap = sc.nextInt();
        ArrayList<Integer> n = new ArrayList<>(cap);
        for (int i = 0; i < cap; i++) {
            n.add(sc.nextInt());
        }
        int k= sc.nextInt();
        P36Josephus_Problem p36 = new P36Josephus_Problem(n,k);
        System.out.println(josephus(p36));
    }
}
