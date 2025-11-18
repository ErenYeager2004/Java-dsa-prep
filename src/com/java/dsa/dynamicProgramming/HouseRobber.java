package dynamicProgramming;

import java.util.Arrays;

public class HouseRobber {
    static int maxSumNonAdjacent(int idx ,int[]arr){
            if(idx == 0) return arr[idx];
            if(idx < 0) return 0;
            int pick = arr[idx] + maxSumNonAdjacent(idx-2,arr);
            int notPick = maxSumNonAdjacent(idx - 1, arr);
            return Math.max(pick,notPick);
    }

    static int maxSumNonAdjacent2(int idx,int[]arr,int[]dp){
        if(idx == 0) return arr[idx];
        if(idx < 0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int pick = arr[idx] + maxSumNonAdjacent2(idx-2,arr,dp);
        int notPick = maxSumNonAdjacent2(idx - 1, arr,dp);
        return dp[idx] =  Math.max(pick,notPick);
    }

    public static int maxSumNonAdjacent3(int idx,int[]arr){
        int[] dp = new int[idx+1];
        Arrays.fill(dp,-1);
        if(idx == 0) return arr[idx];
        if(idx < 0) return 0;
        dp[0] =  arr[0];
        for(int i=1;i<idx;i++){
            int pick = arr[idx];
            if(i > 1) pick+=dp[i-2];
            int notPick = dp[i-1];

            dp[i] = Math.max(pick,notPick);
        }
        return dp[idx];
    }

    public static int maxSumNonAdjacent4(int[]arr)
    {
        int n = arr.length;
        int prev = arr[0];
        int prev2 = 0;
        for (int i=1;i<n;i++){
            int pick = arr[i];
            if(i > 1) pick += prev2;
            int notPick = prev;

            int curr = Math.max(pick,notPick);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        int n = arr.length;
        System.out.println(maxSumNonAdjacent(n-1,arr));
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        //System.out.println(maxSumNonAdjacent2(n-1,arr,dp));
        System.out.println(maxSumNonAdjacent3(n-1,arr));
        System.out.println(maxSumNonAdjacent4(arr));
    }
}

