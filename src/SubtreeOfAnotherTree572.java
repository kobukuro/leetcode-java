// Tree, Depth-First Search, String Matching, Binary Tree, Hash Function
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

    /*
        N is the number of nodes in the tree rooted at the root
        M is the number of nodes in the tree rooted at subRoot
        Time complexity: O(MN).
        For every N node in the tree,
        we check if the tree rooted at node is identical to subRoot.
        This check takes O(M) time, where M is the number of nodes in subRoot.
        Hence, the overall time complexity is O(MN).

        Space complexity: O(M+N).
        There will be at most N recursive call to isSubtree.
        Now, each of these calls will have M recursive calls to isSameTree.
        Before calling isSameTree, our call stack has at most O(N) elements
        and might increase to O(N+M) during the call.
        After calling isSameTree,
        it will be back to at most O(N) since all elements made by isSameTree are popped out.
        Hence, the maximum number of elements in the call stack will be M+N.
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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5));
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        System.out.println(new SubtreeOfAnotherTree572().isSubtree(root, subRoot)); // true
    }
}
