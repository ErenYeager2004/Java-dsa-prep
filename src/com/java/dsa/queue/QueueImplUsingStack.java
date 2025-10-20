package queue;

import java.util.Stack;

public class QueueImplUsingStack {

    Stack<Integer> st = new Stack<>();

    public QueueImplUsingStack() {}

    public void push(int data) {
        this.st.push(data);
    }

    public void push2(int data) {
        Stack<Integer> temp = new Stack<>();
        while(!this.st.isEmpty()) {
            temp.push(this.st.peek());
            this.st.pop();
        }

        this.st.push(data);

        while(!temp.isEmpty()) {
            this.st.push(temp.peek());
            temp.pop();
        }
    }

    public void pop() {
        Stack<Integer> temp = new Stack<>();
        if(this.st.isEmpty()) return;

        while(st.size() > 1) {
            temp.push(this.st.peek());
            this.st.pop();
        }

        this.st.pop();

        while (!temp.isEmpty()) {
            this.st.push(temp.peek());
            temp.pop();
        }
    }

    public void pop2() {
        this.st.pop();
    }

    public int font() {
        Stack<Integer> temp = new Stack<>();
        if(this.st.isEmpty()) return -1;
        while (st.size() > 1) {
            temp.push(this.st.peek());
            this.st.pop();
        }

        int result = this.st.peek();

        while (!temp.isEmpty()) {
            this.st.push(temp.peek());
            temp.pop();
        }

        return result;
    }

    public int font2() {
        if(this.st.isEmpty()) return Integer.MIN_VALUE;
        return this.st.peek();
    }

    public boolean empty() {
        return this.st.isEmpty();
    }
    public static void main(String[] args) {
        QueueImplUsingStack q = new QueueImplUsingStack();
        q.push2(10);
        q.push2(20);
        q.push2(30);
        q.push2(40);

        q.pop2();

        while(!q.empty()) {
            System.out.print(q.font2() + " ");
            q.pop2();
        }
    }
}
