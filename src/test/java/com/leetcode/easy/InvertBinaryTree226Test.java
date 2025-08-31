package com.leetcode.easy;

import com.leetcode.datastructure.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvertBinaryTree226Test {
    private InvertBinaryTree226 solution;

    @BeforeEach
    void setUp() {
        solution = new InvertBinaryTree226();
    }

    @Test
    void testInvertTree_Example1() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9))
        );
        TreeNode invertedRoot = solution.invertTree(root);
        assertEquals(4, invertedRoot.val);
        assertEquals(7, invertedRoot.left.val);
        assertEquals(2, invertedRoot.right.val);
        assertEquals(9, invertedRoot.left.left.val);
        assertEquals(6, invertedRoot.left.right.val);
        assertEquals(3, invertedRoot.right.left.val);
        assertEquals(1, invertedRoot.right.right.val);
        assertNull(invertedRoot.left.left.left);
        assertNull(invertedRoot.left.left.right);
        assertNull(invertedRoot.left.right.left);
        assertNull(invertedRoot.left.right.right);
        assertNull(invertedRoot.right.left.left);
        assertNull(invertedRoot.right.left.right);
        assertNull(invertedRoot.right.right.left);
        assertNull(invertedRoot.right.right.right);
    }

    @Test
    void testInvertTree_Example2() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode invertedRoot = solution.invertTree(root);
        assertEquals(2, invertedRoot.val);
        assertEquals(3, invertedRoot.left.val);
        assertEquals(1, invertedRoot.right.val);
        assertNull(invertedRoot.left.left);
        assertNull(invertedRoot.left.right);
        assertNull(invertedRoot.right.left);
        assertNull(invertedRoot.right.right);
    }

    @Test
    void testInvertTree_Example3() {
        TreeNode root = null;
        TreeNode invertedRoot = solution.invertTree(root);
        assertNull(invertedRoot);
    }
}
