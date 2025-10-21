package stack;
import java.util.Stack;
public class ReverseStack {
    static <T> void reverseStack(Stack<T> st) {
        Stack<T> temp = new Stack<>();
        while (!st.isEmpty()) {
            temp.push(st.pop());
        }
        st.addAll(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        st.forEach(System.out::println);

        reverseStack(st);

        st.forEach(System.out::println);

    }
}
