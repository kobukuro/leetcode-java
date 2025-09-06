// Tags: Tree, DFS, Backtracking
package com.leetcode.medium;

import com.leetcode.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII113 {
    private void dfs(TreeNode node, List<List<Integer>> res, List<Integer> path, int remainingSum) {
        if (node == null) {
            return;
        }
        path.add(node.val);
        if (node.left == null && node.right == null && node.val == remainingSum) {
            res.add(new ArrayList<>(path));
        }
        this.dfs(node.left, res, path, remainingSum - node.val);
        this.dfs(node.right, res, path, remainingSum - node.val);
        path.removeLast();
    }

    /*
        Time Complexity: O(N^2)
        where N are the number of nodes in a tree.
        In the worst case, we could have a complete binary tree and if that is the case,
        then there would be N/2 leaves. For every leaf, we perform a potential
        O(N) operation of copying over the path nodes to a new list to be added to the final res.
        Hence, the complexity in the worst case could be O(N^2).

        Space Complexity: O(N)
        The only additional space that we use is the path list to keep track of nodes along a branch.
     */
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        this.dfs(root, res, new ArrayList<>(), targetSum);
        return res;
    }
}
