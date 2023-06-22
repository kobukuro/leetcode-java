// Tree, Depth-First Search, Binary Search Tree, Binary Tree
public class LowestCommonAncestorOfaBinarySearchTree235 {
    /*
        Time Complexity: O(N),
        where N is the number of nodes in the BST.
        In the worst case we might be visiting all the nodes of the BST.

        Space Complexity: O(N).
        This is because the maximum amount of space
        utilized by the recursion stack would be N
        since the height of a skewed BST could be N.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q || (root.val > p.val && root.val < q.val) || (root.val < p.val && root.val > q.val)) {
            return root;
        }
        if (root.val > p.val) {
            return this.lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < p.val) {
            return this.lowestCommonAncestor(root.right, p, q);
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5)));
        TreeNode q = new TreeNode(8, new TreeNode(7), new TreeNode(9));
        TreeNode root = new TreeNode(6, p, q);
        System.out.println(new LowestCommonAncestorOfaBinarySearchTree235().lowestCommonAncestor(root, p, q).val);
        // 6
    }
}
