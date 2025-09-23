package searching;

import java.util.Scanner;

public class LinearSearch {
    static int linearSearch(int[] arr, int target) {
        for(int i = 0; i <= arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,8,6,7};
        int target = new Scanner(System.in).nextInt();
        if(linearSearch(arr,target) == -1) {
            System.out.println(target + " not found in the array");
        }
        else {
            int index = linearSearch(arr,target);
            System.out.println(target + " found at index " + index);
        }
    }
}
