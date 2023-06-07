public class InvertBinaryTree226 {
    /*
        n:the number of nodes in the tree
        Time Complexity : O(n)
        Space Complexity : O(n)
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


    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        System.out.println(new CommonFunction().levelOrderTraversal(new InvertBinaryTree226().invertTree(root)));
        // [4, 7, 2, 9, 6, 3, 1]
    }
}
