package com.leetcode.easy;

import com.leetcode.datastructure.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubtreeOfAnotherTree572Test {
    private SubtreeOfAnotherTree572 solution;

    @BeforeEach
    void setUp() {
        solution = new SubtreeOfAnotherTree572();
    }

    @Test
    void testIsSubtree_Example1() {
        TreeNode root = new TreeNode(3,
                new TreeNode(4, new TreeNode(1), new TreeNode(2)),
                new TreeNode(5));
        TreeNode subRoot = new TreeNode(4,
                new TreeNode(1),
                new TreeNode(2));

        boolean result = solution.isSubtree(root, subRoot);

        assertTrue(result);
    }

    @Test
    void testIsSubtree_Example2() {
        TreeNode root = new TreeNode(3,
                new TreeNode(4, new TreeNode(1), new TreeNode(2, null, new TreeNode(0))),
                new TreeNode(5));
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));

        boolean result = solution.isSubtree(root, subRoot);

        assertFalse(result);
    }
}
