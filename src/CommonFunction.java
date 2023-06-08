import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CommonFunction {
    public List<Integer> levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res.add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return res;
    }

    public List<Integer> LinkedListTraversal(ListNode head) {
        List<Integer> res = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            res.add(curr.val);
            curr = curr.next;
        }
        return res;
    }
}
