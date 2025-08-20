// Tags: Tree, DFS
package com.leetcode.easy;

import com.leetcode.datastructure.TreeNode;

public class SameTree100 {
    /*
        Time complexity: O(N), where N is a number of nodes in the tree, since one visits each node exactly once.
        Space complexity: O(N) in the worst case of completely unbalanced tree, to keep a recursion stack.
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null) {
            return false;
        }
        if (q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return this.isSameTree(p.left, q.left) && this.isSameTree(p.right, q.right);
    }
}
