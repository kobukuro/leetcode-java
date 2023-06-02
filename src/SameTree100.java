// Tree, Depth-First Search, Breadth-First Search, Binary Tree
public class SameTree100 {
    /*
        Time complexity : O(N),
        where N is a number of nodes in the tree, since one visits each node exactly once.

        Space complexity : O(N) in the worst case of completely unbalanced tree, to keep a recursion stack.
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

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(new SameTree100().isSameTree(p, q));
    }
}
