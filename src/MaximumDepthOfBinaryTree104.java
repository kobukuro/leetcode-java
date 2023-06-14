// Tree, Depth-First Search, Breadth-First Search, Binary Tree
public class MaximumDepthOfBinaryTree104 {
    /*
        Time complexity : we visit each node exactly once, thus the time complexity is O(N),
        where N is the number of nodes.

        Space complexity : in the worst case, the tree is completely unbalanced,
        e.g. each node has only left child node, the recursion call would occur N times
        (the height of the tree), therefore the storage to keep the call stack would be O(N).
        But in the best case (the tree is completely balanced), the height of the tree would be log(N).
        Therefore, the space complexity in this case would be O(log(N)).
        But big o notation considers worst case, so space complexity is O(N).
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(this.maxDepth(root.left), this.maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(new MaximumDepthOfBinaryTree104().maxDepth(root)); // 3
    }
}
