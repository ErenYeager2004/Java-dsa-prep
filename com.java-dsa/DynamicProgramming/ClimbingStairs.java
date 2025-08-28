package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbingStairs {
    static int climb(int n){
        if(n<=1) return 1;
        return climb(n-1)+climb(n-2);
    }

    static int climb1(int n,int[]dp){
        if(n<=1) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = climb1(n-1,dp) + climb1(n-2,dp);
    }

    static int climb2(int n){
        int [] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i=2;i<n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    static int climb3(int n){
        int prev1 = 1;
        int prev2 = 1;
        for (int i=2;i<n;i++){
            int curr =  prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
    public static void main(String[] args) {
        System.out.println(climb(3));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(climb1(n,dp));
    }
}
