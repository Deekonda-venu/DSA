package Data_structre.arreys;

import java.util.ArrayList;

public class P2Leaders {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 2};
        ArrayList<Integer> list = new ArrayList<>();
        int start =0;
        while (start<arr.length){
            int max =0;
            int j1 =0;
            for(int j=start; j<arr.length; j++){
                if(max<arr[j]){
                    max = arr[j];
                    j1 =j;
                }
            }
            list.add(max);
            start = j1+1;
        }
        System.out.println(list);
    }
}
//import java.util.*;
//
//public class Leaders {
//    public static void main(String[] args) {
//        int arr[] = {16, 17, 4, 3, 5, 2};
//        ArrayList<Integer> list = new ArrayList<>();
//
//        int max = arr[arr.length - 1];
//        list.add(max);
//
//        for (int i = arr.length - 2; i >= 0; i--) {
//            if (arr[i] >= max) {
//                max = arr[i];
//                list.add(arr[i]);
//            }
//        }
//
//        // reverse to maintain order
//        Collections.reverse(list);
//
//        System.out.println(list);
//    }
//}