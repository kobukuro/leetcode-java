// Tags: Tree, DFS
package com.leetcode.easy;

import com.leetcode.datastructure.TreeNode;

public class SearchInABinarySearchTree700 {
    /**
     * Time complexity: O(H), where H is a tree height.
     * That results in O(logN) in the average case, and O(N) in the worst case.
     * <p>
     * Space complexity: O(H) to keep the recursion stack,
     * i.e. O(logN) in the average case, and O(N) in the worst case.
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (root.val > val) {
            return this.searchBST(root.left, val);
        } else {
            return this.searchBST(root.right, val);
        }
    }
}
