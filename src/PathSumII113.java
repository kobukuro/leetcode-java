// Tree, Backtracking, Depth-First Search, Binary Tree

import java.util.List;
import java.util.ArrayList;

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
        path.remove(path.size() - 1);
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
        List<Integer> path = new ArrayList<>();
        this.dfs(root, res, path, targetSum);
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1))));
        int targetSum = 22;
        System.out.println(new PathSumII113().pathSum(root, targetSum)); // [[5, 4, 11, 2], [5, 8, 4, 5]]
    }
}
