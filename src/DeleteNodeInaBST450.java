public class DeleteNodeInaBST450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val > key) {
            root.left = this.deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = this.deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            TreeNode curr = root.right;
            while (curr.left != null) {
                curr = curr.left;
            }
            root.val = curr.val;
            root.right = this.deleteNode(root.right, curr.val);
        }
        return root;
    }

    public static void main(String[] args) {
        System.out.println(new DeleteNodeInaBST450().deleteNode(null, 1)); // null
    }
}
