package arrays;

import java.util.Arrays;

public class FindMissingNumber {
    static  int findMissingNumber(int[] arr){
        boolean flag = false;
        for (int i = 0; i <= arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 2; i++) {
                if(arr[i] == j){
                    flag = true;
                    break;
                }
            }
            if(flag){
                return  i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        System.out.println("The missing number in the give array is " + findMissingNumber(arr));
    }
}
