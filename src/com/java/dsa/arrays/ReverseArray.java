package arrays;

import java.util.Arrays;

public class ReverseArray {
    static void reverseArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
