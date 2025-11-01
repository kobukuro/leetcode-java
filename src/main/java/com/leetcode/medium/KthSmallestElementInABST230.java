// Tags: Tree, Binary Search Tree, DFS
package com.leetcode.medium;

import com.leetcode.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInABST230 {
    private void inorder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
    }

    /*
        Time complexity : O(N) to build a traversal.
        Space complexity : O(N) to keep an inorder traversal.
     */
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();
        inorder(root, values);
        return values.get(k - 1);
    }
}
