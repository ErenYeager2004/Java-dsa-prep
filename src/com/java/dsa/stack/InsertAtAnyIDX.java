package stack;

import java.util.Stack;

public class InsertAtAnyIDX {

    static void insertAtAnyIDX(Stack<Integer> st, int x, int IDX) {
        if(st.size() == IDX) {
            st.push(x);
            return;
        }

        int ele = st.peek();
        st.pop();
        insertAtAnyIDX(st, x, IDX);
        st.push(ele);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        insertAtAnyIDX(st, 4, 1);

        st.forEach(System.out::println);
    }
}
