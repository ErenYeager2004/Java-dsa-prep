package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement {

    static List<Integer> nextGreaterElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = arr.length - 1; i >= 0; i--) {
            if(st.isEmpty()) {
                st.push(arr[i]);
                ans.add(-1);
            }
            else{
                if(st.peek() > arr[i]) {
                    ans.add(st.peek());
                    st.push(arr[i]);
                }else{
                    while(!st.isEmpty() && st.peek() < arr[i] ){
                        st.pop();
                    }
                    st.push(arr[i]);
                    ans.add(-1);
                }
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 0, 4, 8, 1, 7};
        System.out.println(nextGreaterElement(arr));
    }
}
