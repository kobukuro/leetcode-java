// Tags: Tree, DFS
package com.leetcode.easy;

import com.leetcode.datastructure.TreeNode;

public class PathSum112 {
    /**
     * Time complexity: we visit each node exactly once,
     * thus the time complexity is O(N), where N is the number of nodes.
     * <p>
     * Space complexity: in the worst case,
     * the tree is completely unbalanced,
     * e.g. each node has only one child node,
     * the recursion call would occur N times (the height of the tree),
     * therefore the storage to keep the call stack would be O(N).
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && root.val == targetSum) {
            return true;
        }
        return this.hasPathSum(root.left, targetSum - root.val) || this.hasPathSum(root.right, targetSum - root.val);
    }
}
