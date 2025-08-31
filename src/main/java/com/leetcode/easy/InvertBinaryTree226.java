// Tags: Tree, DFS
package com.leetcode.easy;

import com.leetcode.datastructure.TreeNode;

public class InvertBinaryTree226 {
    /*
        n: the number of nodes in the tree
        Time complexity: O(n), since each node in the tree is visited only once.
        We cannot do better than that, since at the very least we have to visit each node to invert it.

        Space complexity: O(n).
        Because of recursion, O(h) function calls will be placed on the stack in the worst case,
        where h is the height of the tree. Because h∈O(n), the space complexity is O(n).
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode originalLeft = root.left;
        root.left = root.right;
        root.right = originalLeft;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
