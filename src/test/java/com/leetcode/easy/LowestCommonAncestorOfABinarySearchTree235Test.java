package com.leetcode.easy;

import com.leetcode.datastructure.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowestCommonAncestorOfABinarySearchTree235Test {
    private LowestCommonAncestorOfABinarySearchTree235 solution;

    @BeforeEach
    void setUp() {
        solution = new LowestCommonAncestorOfABinarySearchTree235();
    }

    @Test
    void testLowestCommonAncestor_Example1() {
        TreeNode root = new TreeNode(6,
                new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8, new TreeNode(7), new TreeNode(9)));
        TreeNode p = root.left; // Node with value 2
        TreeNode q = root.right; // Node with value 8
        TreeNode result = solution.lowestCommonAncestor(root, p, q);
        assertEquals(root, result);
    }

    @Test
    void testLowestCommonAncestor_Example2() {
        TreeNode root = new TreeNode(6,
                new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8, new TreeNode(7), new TreeNode(9)));
        TreeNode p = root.left; // Node with value 2
        TreeNode q = root.left.right; // Node with value 4
        TreeNode result = solution.lowestCommonAncestor(root, p, q);
        assertEquals(p, result);
    }

    @Test
    void testLowestCommonAncestor_Example3() {
        TreeNode root = new TreeNode(2, new TreeNode(1), null);
        TreeNode p = root; // Node with value 2
        TreeNode q = root.left; // Node with value 1
        TreeNode result = solution.lowestCommonAncestor(root, p, q);
        assertEquals(root, result);
    }
}
