package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    //using recursion
    public static int fibo(int n){
        if(n<=1) return  n;
        return fibo(n-1) + fibo(n-2);
    }

    //using memoization
    static int fibo1(int n,int[]dp){
        if(n<=1) return  n;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = fibo1(n-1,dp) + fibo1(n-2,dp);
    }

    //using tabulation
    static int fibo2(int n){
        int[]dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i=2;i<n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    //using most-optimized way
    static int fibo3(int n){
         int prev1 = 1;
         int prev2 = 0;
         for(int i=2;i<n;i++){
             int curr = prev1 + prev2;
             prev2 = prev1;
             prev1 = curr;
         }
         return prev1;
    }

    static void printSeries(int n){
        ArrayList<Integer>series = new ArrayList<>();
        for(int i=0;i<n;i++){
            series.add(fibo(i));
        }
        System.out.println(series);
    }
    public static void main(String[] args) {
        // fibonacci series-> 0 1 1 2 3 5 8 13
        printSeries(5);
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibo1(n,dp));
    }
}
