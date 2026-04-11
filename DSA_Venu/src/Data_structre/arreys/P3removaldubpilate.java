package Data_structre.arreys;

import java.util.ArrayList;

public class P3removaldubpilate {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 2};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int cou =0;
            for(int j=0; j<arr.length-1; j++){
                if(arr[i]==arr[j]){
                    cou++;
                }
            }
            if(cou>0){
                if(!list.contains(arr[i])){
                    list.add(arr[i]);
                }
            }else{
                list.add(arr[i]);
            }

        }
        System.out.println(list);


        for(int i=0; i<arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }

        }
        System.out.println(list);
    }
}
