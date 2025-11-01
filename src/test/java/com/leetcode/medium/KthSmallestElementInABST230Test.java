package com.leetcode.medium;

import com.leetcode.datastructure.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthSmallestElementInABST230Test {
    private KthSmallestElementInABST230 solution;

    @BeforeEach
    public void setUp() {
        solution = new KthSmallestElementInABST230();
    }

    @Test
    void testKthSmallest_Example1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(1, null, new TreeNode(2)),
                new TreeNode(4));

        int k = 1;

        int expected = 1;
        int result = solution.kthSmallest(root, k);

        assertEquals(expected, result);
    }

    @Test
    void testKthSmallest_Example2() {
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2,
                                new TreeNode(1),
                                null),
                        new TreeNode(4)),
                new TreeNode(6));

        int k = 3;

        int expected = 3;
        int result = solution.kthSmallest(root, k);

        assertEquals(expected, result);
    }
}
