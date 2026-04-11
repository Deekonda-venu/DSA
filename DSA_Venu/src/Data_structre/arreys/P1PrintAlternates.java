package Data_structre.arreys;

public class P1PrintAlternates {
    public static void main(String[] args) {
        int[] ar = {10,20,30,40,50};
        for(int i=1; i<=ar.length; i++){
            if(i%2==0){
                System.out.println(ar[i]);
            }
        }
    }
}
