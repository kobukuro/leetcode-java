import java.util.ArrayList;
import java.util.List;

public class MaximumTwinSumOfALinkedList2130 {
    public int pairSum(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }
        int res = 0;
        int l = 0;
        int r = values.size() - 1;
        while (l < r) {
            res = Math.max(res, values.get(l) + values.get(r));
            l++;
            r--;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(10000));
        // 10001
        System.out.println(new MaximumTwinSumOfALinkedList2130().pairSum(head));
    }
}
