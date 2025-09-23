package dynamicProgramming;

import java.util.Arrays;

public class FrogJump {
    static int jump(int n,int[]arr){
        if(n == 0) return n;
        int left = jump(n-1,arr) + Math.abs(arr[n] - arr[n-1]);
        int right = Integer.MAX_VALUE;
        if(n>1)
            right = jump(n-2,arr) + Math.abs(arr[n] - arr[n-2]);

        return Math.min(left,right);
    }

    static int jump2(int n,int[]arr,int[]dp){
        if(n == 0) return n;
        if(dp[n]!=-1) return dp[n];

        int left = jump2(n-1,arr,dp) + Math.abs(arr[n] - arr[n-1]);
        int right = Integer.MAX_VALUE;
        if(n>1)
            right = jump2(n-2,arr,dp) + Math.abs(arr[n] - arr[n-2]);

        return dp[n] = Math.min(left,right);
    }

    static int jump3(int n,int[]arr){
        int[]dp = new int[n+1];
        Arrays.fill(dp,-1);

        dp[0] = 0;
        for(int i=1;i<=n;i++){
            int left = dp[i-1] + Math.abs(arr[i] -  arr[i-1]);
            int right = Integer.MAX_VALUE;
            if(i > 1)
                right = dp[i-2] + Math.abs(arr[i] - arr[i-2]);

            dp[i] = Math.min(left,right);
        }
        return dp[n];
    }


    static int jump4(int n,int[]arr){
        if(n == 0) return n;
        int prev2 = 0;
        int prev1 = 0;
        for(int i=1;i<n;i++){
            int lft = prev1 + Math.abs(arr[i] - arr[i-1]);
            int rgt = Integer.MAX_VALUE;
            if(i > 1){
                rgt =  prev2 + Math.abs(arr[i] - arr[i-2]);
            }
            int curr = Math.min(lft,rgt);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        int [] arr = {30,10,60,10};
        int n = arr.length;
        System.out.println(jump(n-1,arr));
        System.out.println(jump4(n,arr));
        System.out.println(jump3(n-1,arr));
    }
}
