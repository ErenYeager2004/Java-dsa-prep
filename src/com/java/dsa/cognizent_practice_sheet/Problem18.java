package cognizent_practice_sheet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem18{
    static int maxBooks(int[] arr, int idx, int target) {
        if(idx == 0) {
            if (target % arr[0] == 0) return target / arr[0];
            else return Integer.MIN_VALUE;
        }
        if (target == 0) return 0;  // no more needed
        if (idx < 0) return Integer.MIN_VALUE; // impossible case

        int notTake = maxBooks(arr, idx-1, target);
        int take = Integer.MIN_VALUE;
        if (arr[idx] <= target) {
            int sub = maxBooks(arr, idx, target - arr[idx]);
            if (sub != Integer.MIN_VALUE) take = 1 + sub;
        }

        return Math.max(notTake, take);
    }
    public static void main(String[] args) throws Exception{
        //in this example i use buffer reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[size];

        for(int i=0;i<arr.length;i++) {
            int x = Integer.parseInt(br.readLine());
            arr[i] = x;
        }
        int target = 5;
        br.close();

        // System.out.println(Arrays.toString(arr));
        System.out.println(maxBooks(arr, size-1, target));

    }
}
