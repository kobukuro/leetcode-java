package com.leetcode.easy;

import com.leetcode.datastructure.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SameTree100Test {
    private SameTree100 solution;

    @BeforeEach
    void setUp() {
        solution = new SameTree100();
    }

    @Test
    void testIsSameTree_Example1() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        boolean result = solution.isSameTree(p, q);

        assertTrue(result);
    }

    @Test
    void testIsSameTree_Example2() {
        TreeNode p = new TreeNode(1, new TreeNode(2), null);
        TreeNode q = new TreeNode(1, null, new TreeNode(2));

        boolean result = solution.isSameTree(p, q);

        assertFalse(result);
    }

    @Test
    void testIsSameTree_Example3() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q = new TreeNode(1, new TreeNode(1), new TreeNode(2));

        boolean result = solution.isSameTree(p, q);

        assertFalse(result);
    }
}
