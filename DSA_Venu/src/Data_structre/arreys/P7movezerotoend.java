package Data_structre.arreys;

public class P7movezerotoend {
    public static void main(String[] args) {
        int[] ar = {1, 2, 0, 4, 3, 0, 5, 0};
        for(int i=0; i<ar.length; i++){
            int temp=0;
            if(ar[i]==0){
                for(int j=i+1; j< ar.length; j++){
                    if(ar[j]!=0){
                        temp=ar[i];
                        ar[i]=ar[j];
                        ar[j]=temp;
                    }
                }
            }
        }
        for(int i=0; i< ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }
}
//int[] ar = {1, 2, 0, 4, 3, 0, 5, 0};
//
//int j = 0;
//
//for(int i = 0; i < ar.length; i++){
//        if(ar[i] != 0){
//int temp = ar[i];
//ar[i] = ar[j];
//ar[j] = temp;
//j++;
//        }
//        }
//
//        for(int i = 0; i < ar.length; i++){
//        System.out.print(ar[i] + " ");
//}