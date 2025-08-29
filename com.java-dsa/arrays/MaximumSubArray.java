package arrays;

public class MaximumSubArray {
    static int maxSubArrayBrute(int[] nums) {
        //T.C -> O(n2);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            int sum = 0;
            for(int j=0; j<nums.length; j++) {
                sum += nums[j];
                max = Math.max(max,sum);
            }
        }
        return max;
    }

    static int maxSubArray(int[] nums) {
        //using Kadane's Algorithm
        //T.C -> O(n);
        int maxSum = nums[0], currSum = nums[0];
        for(int i=1; i<nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,6,7};
        System.out.println(maxSubArrayBrute(nums));
        System.out.println(maxSubArray(nums));
    }
}
