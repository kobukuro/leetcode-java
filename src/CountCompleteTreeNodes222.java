import java.util.ArrayList;
import java.util.List;

public class CountCompleteTreeNodes222 {
    private void inorder(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }
        this.inorder(node.left, values);
        values.add(node.val);
        this.inorder(node.right, values);
    }

    public int countNodes(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        this.inorder(root, values);
        return values.size();
    }
}
