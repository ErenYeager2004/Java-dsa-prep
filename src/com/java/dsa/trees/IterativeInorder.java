package trees;

// it's basically the inorder traversal without using recursion...
// inorder follows this pattern = left -> root -> right.

//              [1]
//             /  \
//          [2]  [3]
//         /  \
//       [4]  [5]
//           /  \
//         [6]  [7]


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeInorder {

    static List<Integer> iterativeInorder(Node root) {
        List<Integer> inorder = new ArrayList<>();
        Stack<Node> st = new Stack<>();

        Node temp = root;

        while(true) {
            if(temp != null) {
                st.push(temp);
                temp = temp.left;
            }
            else {
                if(st.isEmpty()) {
                    break;
                }
                temp = st.pop();
                inorder.add(temp.data);
                temp = temp.right;
            }
        }
        return inorder;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);

        System.out.println(iterativeInorder(root));
    }
}

