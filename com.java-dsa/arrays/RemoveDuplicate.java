package arrays;

import java.util.Arrays;
import java.util.HashSet;

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

    static void removeDuplicate3(int[] arr) {

    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,4,4,4,6,7,7,7,10};
        removeDuplicate(arr);
        System.out.println(Arrays.toString(removeDuplicate2(arr)));
    }
}
