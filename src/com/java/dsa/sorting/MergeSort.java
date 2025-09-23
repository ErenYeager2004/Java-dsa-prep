package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    static void mergeSort(int[]arr, int low, int high) {
        int mid = (low+high) / 2;
        if(low >= high) return;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid) {
            temp.add(arr[left++]);
        }

        while(right <= high) {
            temp.add(arr[right++]);
        }

        for (int i=low; i<high; i++) {
            arr[i] = temp.get(i-low);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5,1,6,2,10};
        int low = 0;
        int high = arr.length-1;
        mergeSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }  
}
