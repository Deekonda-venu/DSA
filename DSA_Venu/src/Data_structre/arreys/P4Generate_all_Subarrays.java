package Data_structre.arreys;

import java.util.ArrayList;

public class P4Generate_all_Subarrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        for (int i=0; i< arr.length-1; i++){
            ArrayList<Integer> sub = new ArrayList<>();

            for (int j = i; j < arr.length; j++) {
                sub.add(arr[j]); // add element

                // add a copy of current subarray
                list1.add(new ArrayList<>(sub));
            }
        }

        System.out.println(list1);
    }
}
