// Tree, Depth-First Search, Binary Search Tree, Binary Tree

import java.util.List;
import java.util.ArrayList;

public class KthSmallestElementInaBST230 {
    private void inorder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        this.inorder(node.left, res);
        res.add(node.val);
        this.inorder(node.right, res);
    }
    /*
        Time complexity : O(N) to build a traversal.
        Space complexity : O(N) to keep an inorder traversal.
     */
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> res = new ArrayList<>();
        this.inorder(root, res);
        return res.get(k - 1);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4));
        int k = 1;
        System.out.println(new KthSmallestElementInaBST230().kthSmallest(root, k)); // 1
    }
}
