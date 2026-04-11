package Data_structre.arreys;

public class P6Rotate_an_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int j=0;
        System.out.println(arr.length);
        int[] arr1 = new int[arr.length];
        for(int i=k; i<arr.length; i++){
            arr1[j]=arr[i];
            j++;
        }
        for(int i= 0; i<k; i++)
        {
            arr1[j]=arr[i];
            j++;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr1[i]+" ");
        }


        System.out.println("===================== ");
        int[] arr2 = new int[arr.length];

        int l=0;
        for(int i= arr.length-k; i<arr.length; i++){
            arr2[l]=arr[i];
            l++;
        }
        for(int i=0; i< arr.length-k; i++){
            arr2[l]=arr[i];
            l++;
        }


        for(int i=0; i<arr.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
