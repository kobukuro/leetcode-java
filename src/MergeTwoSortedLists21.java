// Linked List, Recursion
public class MergeTwoSortedLists21 {
    /*
        length of list1:m, length of list2:n

        Time Complexity:O(m+n)
        因為假如當smaller list的最後一個值是所有值裡最大的, 那還是要把list1以及list2都traverse過

        Space Complexity :O(1)
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode p1 = list1;
        ListNode p2 = list2;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                curr.next = p1;
                p1 = p1.next;
            } else {
                curr.next = p2;
                p2 = p2.next;
            }
            curr = curr.next;
        }
        if (p1 != null) {
            curr.next = p1;
        }
        if (p2 != null) {
            curr.next = p2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode mergedList = new MergeTwoSortedLists21().mergeTwoLists(list1, list2);
        System.out.println(new CommonFunction().LinkedListTraversal(mergedList));
        // [1, 1, 2, 3, 4, 4]
    }
}
