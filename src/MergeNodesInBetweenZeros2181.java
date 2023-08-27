public class MergeNodesInBetweenZeros2181 {
    public ListNode mergeNodes(ListNode head) {
        ListNode res = null;
        ListNode currRes = res;
        ListNode curr = head;
        int cnt = 0;
        while (curr != null) {
            if (curr.val == 0 && cnt != 0) {
                if (res == null) {
                    res = new ListNode(cnt);
                    currRes = res;
                } else {
                    currRes.next = new ListNode(cnt);
                    currRes = currRes.next;
                }
                cnt = 0;
            } else if (curr.val != 0) {
                cnt += curr.val;
            }
            curr = curr.next;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0, new ListNode(1, new ListNode(0)));
        System.out.println(new MergeNodesInBetweenZeros2181().mergeNodes(head));
    }
}
