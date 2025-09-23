package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {
    static void removeDuplicate(int[] arr) {
        //using collection framework...
        HashSet<Integer> ans = new HashSet<>();
        for(int i : arr) {
            ans.add(i);
        }

        System.out.println(ans);
    }

    static int[] removeDuplicate2(int[] arr){
        //using Arrays class and stream
        return Arrays.stream(arr).distinct().toArray();
    }

    static List<Integer> removeDuplicate3(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i] != arr[i+1]) {
                ans.add(arr[i + 1]);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,4,4,4,6,7,7,7,10};
        removeDuplicate(arr);
        System.out.println(Arrays.toString(removeDuplicate2(arr)));
        System.out.println(removeDuplicate3(arr));
    }
}
