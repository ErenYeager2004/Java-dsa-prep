package trees;

public class DiameterOfABinaryTree {
    static int diameterOfaBinaryTree(Node root) {
        int[] diameter = new int[1];
        height(root, diameter);
        return diameter[0];

    }

    private static int height(Node root, int[] diameter) {
        if(root == null) {
            return 0;
        }

        int lh = height(root.left, diameter);
        int rh = height(root.right, diameter);
        diameter[0] = Math.max(diameter[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }

}
