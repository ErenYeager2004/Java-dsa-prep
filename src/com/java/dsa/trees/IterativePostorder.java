package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePostorder {

    static List<Integer> postOrderTraversal(Node root) {
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        List<Integer> postOrder = new ArrayList<>();

        if(root == null)return postOrder;

        st1.push(root);

        while(!st1.isEmpty()) {
            root = st1.pop();
            st2.add(root);
            if(root.left != null) st1.push(root.left);
            if(root.right != null) st2.push(root.right);
        }

        while(!st2.isEmpty()) {
            postOrder.add(st2.pop().data);
        }

        return postOrder;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);

        System.out.println(postOrderTraversal(root));
    }
}
