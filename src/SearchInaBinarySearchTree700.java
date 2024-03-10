public class SearchInaBinarySearchTree700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        if (root.val > val) {
            return this.searchBST(root.left, val);
        }
        return this.searchBST(root.right, val);
    }

    public static void main(String[] args) {
        System.out.println(new SearchInaBinarySearchTree700().searchBST(null, 1)); // null
    }
}
