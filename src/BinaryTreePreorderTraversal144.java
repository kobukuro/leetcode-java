import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal144 {
    public void preorder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        res.add(node.val);
        preorder(node.left, res);
        preorder(node.right, res);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        this.preorder(root, res);
        return res;
    }
}
