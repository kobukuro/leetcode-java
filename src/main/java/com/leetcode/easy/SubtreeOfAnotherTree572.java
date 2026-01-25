// Tags: Tree, DFS
package com.leetcode.easy;

import com.leetcode.datastructure.TreeNode;

public class SubtreeOfAnotherTree572 {
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

    /**
     * N is the number of nodes in the tree rooted at the root
     * M is the number of nodes in the tree rooted at subRoot
     * <p>
     * Time complexity: O(M*N).
     * For each of the N nodes in the tree,
     * we check if the tree rooted at node is identical to subRoot.
     * This check takes O(M) time, where M is the number of nodes in subRoot.
     * Hence, the overall time complexity is O(M*N).
     * <p>
     * Space complexity: O(M+N).
     * There will be at most N recursive calls to isSubtree.
     * Now, each of these calls will have M recursive calls to isSameTree.
     * Before calling isSameTree, our call stack has at most O(N) elements
     * and might increase to O(N+M) during the call.
     * After calling isSameTree,
     * it will be back to at most O(N) since all elements made by isSameTree are popped out.
     * Hence, the maximum number of elements in the call stack will be M+N.
     */
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (this.isSameTree(root, subRoot)) {
            return true;
        }
        return this.isSubtree(root.left, subRoot) || this.isSubtree(root.right, subRoot);
    }
}
