package com.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.leetcode.datastructure.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PathSum112Test {
    private PathSum112 solution;

    @BeforeEach
    void setUp() {
        solution = new PathSum112();
    }

    @Test
    void testHasPathSum_Example1() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        boolean result = solution.hasPathSum(root, targetSum);

        assertTrue(result);
    }

    @Test
    void testHasPathSum_Example2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        int targetSum = 5;

        boolean result = solution.hasPathSum(root, targetSum);

        assertFalse(result);
    }

    @Test
    void testHasPathSum_Example3() {
        TreeNode root = null;

        int targetSum = 0;

        boolean result = solution.hasPathSum(root, targetSum);

        assertFalse(result);
    }
}
