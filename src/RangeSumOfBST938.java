public class RangeSumOfBST938 {
    int res = 0;

    private void inorder(TreeNode node, int low, int high) {
        if (node == null) {
            return;
        }
        if (node.val >= low && node.val <= high) {
            this.res += node.val;
        }
        this.inorder(node.left, low, high);
        this.inorder(node.right, low, high);
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        this.inorder(root, low, high);
        return this.res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        int low = 1;
        int high = 3;
        System.out.println(new RangeSumOfBST938().rangeSumBST(root, low, high)); // 2
    }
}
