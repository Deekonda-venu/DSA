package Data_structre.arreys;

public class P9MinCosttoMakeSize {
    public static void main(String[] args) {
        int[] arr = {4,3,2};
        int min =arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println((arr.length-1)*min);
    }
}
