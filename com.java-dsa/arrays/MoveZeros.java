package arrays;

import java.util.Arrays;

public class MoveZeros {
    static void moveZerosBrute(int[] nums) {
        //Extra array O(n);
        int[] temp = new int[nums.length];
        int idx = 0;
        for (int i : nums) {
            if (i != 0) {
                temp[idx++] = i;
            }
        }
        System.arraycopy(temp,0,nums,0,nums.length);
        System.out.println(Arrays.toString(temp));
    }

    static void moveZeros(int[] nums) {
        // T.C- > O(n) optimized in place
        int insertPos = 0;
        for(int i : nums) {
            nums[insertPos++] = i;
        }
        while(insertPos < nums.length) {
            nums[insertPos++] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {1,0,2,3,0,0,6,7};
        moveZerosBrute(nums);
        moveZeros(nums);
    }
}
