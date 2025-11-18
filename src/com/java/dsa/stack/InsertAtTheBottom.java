package stack;

import java.util.Stack;

public class InsertAtTheBottom {

    static void insertAtBottom(Stack<Integer> st, int x) {
        if(st.isEmpty()) {
            st.push(x);
            return;
        }

        int topElement = st.peek();
        st.pop();
        insertAtBottom(st, x);
        st.push(topElement);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        int element = 4;

        insertAtBottom(st, element);

        st.forEach(System.out::println);

    }
}
