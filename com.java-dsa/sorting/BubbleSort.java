package sorting;

import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++) {
            boolean flag = false;
            for(int j=0;j<arr.length-1;j++) {
                if(arr[j] > arr[j+1]) {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!flag) break;
        }
    }
    public static void main(String[] args) {
        // int[] arr = {2,1,3,4,5,7};
        int[] arr = {1,2,3,4,5,6,7,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
