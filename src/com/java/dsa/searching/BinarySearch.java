package searching;

import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = new Scanner(System.in).nextInt();
        if(binarySearch(arr, target) == -1) {
            System.out.println(target + " not found in the array");
        }else{
            int idx = binarySearch(arr, target);
            System.out.println(target + " found at index " + idx);
        }
    }
}
