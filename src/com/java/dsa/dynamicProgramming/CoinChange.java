package dynamicProgramming;

//After Watching a movie at PVR, Adil is pondering over the number of ways in which he
//can pay for the movie. He has x1, x2, x3, x4 coins of values 1,2,5 and 10 respectively.
//He wants to determine the number of ways in which he can pay an amount A.
//You need to fill in a function that returns the number of ways to pay total amount
//Input Specifications:
//Input 1: An integer value denoting the total amount to be paid
//Output Specification:
//Return an Integer value denoting the number of ways to pay the total amount
//Example1:
//Input1: 40
//Output : 195


//try all the ways -> recursion...

//Recurrence - > express -> (idx, target)
//Explore all the possibilities
// sum up all the possibilities

public class CoinChange {
    static int allPossibilities(int[] arr, int idx, int target){
        //base case
        if(idx == 0){
            if(target % arr[0] == 0) return 1;
        }
        int notTake = allPossibilities(arr,idx-1,target);
        int take = 0;
        if(arr[idx] <= target){
            take = allPossibilities(arr,idx,target-arr[idx]);
        }
        return take+notTake;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10};
        int target = 40;
        System.out.println(allPossibilities(arr,arr.length-1,target));
    }
}
