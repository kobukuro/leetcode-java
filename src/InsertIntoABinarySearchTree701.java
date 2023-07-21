public class InsertIntoABinarySearchTree701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode curr = root;
        while (true) {
            if (curr.val > val) {
                if (curr.left == null) {
                    curr.left = new TreeNode(val);
                    return root;
                }
                curr = curr.left;
            }
            if (curr.val < val) {
                if (curr.right == null) {
                    curr.right = new TreeNode(val);
                    return root;
                }
                curr = curr.right;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new InsertIntoABinarySearchTree701().insertIntoBST(null, 1));
    }
}
