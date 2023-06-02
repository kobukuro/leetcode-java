// Linked List, Recursion
public class ReverseLinkedList206 {
    /*
        iterative solution
        Time complexity : O(n)
        Space complexity : O(1)
     */
    public ListNode iterativeReverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    /*
        recursive solution
        Time complexity : O(n)
        Space complexity : O(n), The extra space comes from implicit stack space due to recursion.
        The recursion could go up to n levels deep.
    */
    public ListNode recursiveReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = this.recursiveReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode curr = new ReverseLinkedList206().iterativeReverseList(head);
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
        head = new ListNode(3, new ListNode(4));
        curr = new ReverseLinkedList206().recursiveReverseList(head);
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
