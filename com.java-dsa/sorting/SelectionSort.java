package sorting;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length-2; i++) {
            int min = i;
            for(int j=i; j<arr.length-1;j++){
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,6,2,10};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
