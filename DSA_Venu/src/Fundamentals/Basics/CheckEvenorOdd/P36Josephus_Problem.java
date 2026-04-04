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
        int result = 0;
        boolean n = true;
        int start = p.k;
        int len = p.n.size();
        int rotaion=0;
        while(n){

            for(int i=start; i<len; i++){
                rotaion = rotaion+1;
                if(rotaion==len){
                    p.n.remove(i);

                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> n = new ArrayList<>(5);
        int k= sc.nextInt();
        P36Josephus_Problem p36 = new P36Josephus_Problem(n,k);
        josephus(p36);
    }
}
