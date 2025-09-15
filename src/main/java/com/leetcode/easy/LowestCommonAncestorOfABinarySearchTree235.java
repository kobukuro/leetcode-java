// Tags: Tree, DFS, Binary Search Tree
package com.leetcode.easy;

import com.leetcode.datastructure.TreeNode;

public class LowestCommonAncestorOfABinarySearchTree235 {
    /*
        Time complexity: O(N),
        where N is the number of nodes in the BST.
        In the worst case we might be visiting all the nodes of the BST.

        Space complexity: O(N).
        This is because the maximum amount of space
        utilized by the recursion stack would be N
        since the height of a skewed BST could be N.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > root.val && q.val > root.val) {
            return this.lowestCommonAncestor(root.right, p, q);
        }
        if (p.val < root.val && q.val < root.val) {
            return this.lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }
}
