package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge2Arrays {
    static int[] merge(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];
        System.arraycopy(arr1,0,ans,0,arr1.length);
        System.arraycopy(arr2,0,ans,arr1.length,arr1.length);

        return ans;
    }

    static List<Integer> merge2(int[] arr1, int[] arr2){
        List<Integer> ans = new ArrayList<>();
        int i = 0, j= 0;
        int n = arr1.length;
        int m = arr2.length;

        while (i < n && j < m) {
            if(arr1[i] < arr2[j]){
                ans.add(arr1[i]);
                i++;
            }else{
                ans.add(arr2[j]);
                j++;
            }
        }

        while (i < n) {
            ans.add(arr1[i]);
            i++;
        }

        while (j < m) {
            ans.add(arr2[j]);
            j++;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

        System.out.println(Arrays.toString(merge(arr1,arr2)));
        System.out.println(merge2(arr1,arr2));
    }
}
