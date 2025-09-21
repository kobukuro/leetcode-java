package com.leetcode.easy;

import com.leetcode.datastructure.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListCycle141Test {
    private LinkedListCycle141 solution;

    @BeforeEach
    void setUp() {
        solution = new LinkedListCycle141();
    }

    @Test
    void testHasCycle_Example1() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Create a cycle here

        assertTrue(solution.hasCycle(head));
    }

    @Test
    void testHasCycle_Example2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head; // Create a cycle here

        assertTrue(solution.hasCycle(head));
    }

    @Test
    void testHasCycle_Example3() {
        ListNode head = new ListNode(1);

        assertFalse(solution.hasCycle(head));
    }

    @Test
    void testHasCycle_Example4() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        assertFalse(solution.hasCycle(head));
    }
}
