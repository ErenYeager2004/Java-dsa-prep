package arrays;

import javax.print.DocFlavor;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Set;

public class RotateArray {
    static void rotateArrayBrute(int[] nums,int k) {
        k %= nums.length;
        for(int i=0; i<k; i++) {
            int last = nums[nums.length - 1];
            for(int j= nums.length-1; j>0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = last;
        }
        System.out.println(Arrays.toString(nums));
    }
    static void rotateArray(int[] nums, int k) {
        k %= nums.length;
        reverse(nums,0, nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k, nums.length-1);

        System.out.println(Arrays.toString(nums));

    }
    private static void reverse(int[] nums,int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    static int[] rotateArray2(int[] arr, int k) {
        k %= arr.length;
        Deque<Integer> temp = new ArrayDeque<>();
        for(int i : arr) {
            temp.add(i);
        }
       while (k > 0) {
           int x = temp.getFirst();
           temp.removeFirst();
           temp.addLast(x);
           k--;
       }
        return temp.stream().mapToInt(Integer::intValue).toArray();
    }

//    static int[] rotateArray3(int[] arr, int k){
//
//    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int k = 3;
        rotateArrayBrute(nums,k);
        rotateArray(nums,k);
        System.out.println(Arrays.toString(rotateArray2(nums,k)));
    }
}
