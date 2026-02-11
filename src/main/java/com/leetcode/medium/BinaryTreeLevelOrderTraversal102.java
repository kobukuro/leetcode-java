// Tags: Tree, BFS
package com.leetcode.medium;

import com.leetcode.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal102 {
    /**
     * Time complexity: O(N) since each node is processed exactly once.
     * <p>
     * Space complexity: The space complexity for BFS is O(w) where w is the maximum width of the tree.
     * Due to the nature of BFS, at any given moment, the queue holds no more than two levels of nodes.
     * In the worst case, a level in a full binary tree contains at most half of the total nodes
     * (i.e. N/2), i.e. this is also the level where the leaf nodes reside.
     * Hence, the overall space complexity of the algorithm is O(N). (/2 could be ignored)
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    level.add(node.val);
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }
            res.add(level);
        }
        return res;
    }
}
