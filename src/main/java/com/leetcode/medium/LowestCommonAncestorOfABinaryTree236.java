// Tags: Tree, DFS
package com.leetcode.medium;

import com.leetcode.datastructure.TreeNode;

public class LowestCommonAncestorOfABinaryTree236 {
    /*
        Time complexity: O(N),
        where N is the number of nodes in the binary tree.
        In the worst case we might be visiting all the nodes of the binary tree.

        Space complexity: O(N).
        This is because the maximum amount of space utilized by the recursion stack would be N
        since the height of a skewed binary tree could be N.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q || root == null) {
            return root;
        }
        TreeNode left = this.lowestCommonAncestor(root.left, p, q);
        TreeNode right = this.lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        if (left != null) {
            return left;
        }
        return right;
    }
}
