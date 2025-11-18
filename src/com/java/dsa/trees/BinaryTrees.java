package trees;

import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
public class BinaryTrees {
    static void preOrder(Node root) {
        if(root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root) {
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void postOrder(Node root) {
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    static List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();

        if(root == null) return wrapList;
        queue.offer(root);
        while(!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> subList = new LinkedList<>();
            for(int i = 0; i < level; i++) {
                Node current = queue.poll();
                assert current != null;
                subList.add(current.data);
                if(current.left != null) {
                    queue.offer(current.left);
                }
                if(current.right != null) {
                    queue.offer(current.right);
                }
            }
            wrapList.add(subList);
        }
        return wrapList;
    }

    static void reverseInOrder(Node root) {
        if(root == null) return;

        reverseInOrder(root.right);
        System.out.print(root.data + " ");
        reverseInOrder(root.left);
    }

    static List<Integer> iterativePreOrder(Node root) {
        Stack<Node> st = new Stack<>();
        List<Integer> preOrder = new ArrayList<>();
        if(root == null) return preOrder;
        st.push(root);
        while(!st.empty()) {
            root = st.pop();
            preOrder.add(root.data);
            if(root.right != null) {
                st.push(root.right);
            }
            if(root.left != null) {
                st.push(root.left);
            }
        }
        return preOrder;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right = new Node(3);
        root.right.left = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);

        System.out.println();
        levelOrder(root);

        System.out.println(levelOrder(root));

        reverseInOrder(root);

        System.out.println();

        System.out.println(iterativePreOrder(root));

        System.out.println(DiameterOfABinaryTree.diameterOfaBinaryTree(root));
    }
}
