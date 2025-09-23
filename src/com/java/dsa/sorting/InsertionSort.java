package sorting;

import java.util.Arrays;

public class InsertionSort {
    static void insertion(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,7,6,5};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
