package com.leetcode.easy;

import com.leetcode.datastructure.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        TreeNode result = solution.lowestCommonAncestor(root, p, q);
        assert result.val == 6;
    }

    @Test
    void testLowestCommonAncestor_Example2() {
        TreeNode root = new TreeNode(6,
                new TreeNode(2, new TreeNode(0), new TreeNode(4, new TreeNode(3), new TreeNode(5))),
                new TreeNode(8, new TreeNode(7), new TreeNode(9)));
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(4);
        TreeNode result = solution.lowestCommonAncestor(root, p, q);
        assert result.val == 2;
    }

    @Test
    void testLowestCommonAncestor_Example3() {
        TreeNode root = new TreeNode(2, new TreeNode(1), null);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(1);
        TreeNode result = solution.lowestCommonAncestor(root, p, q);
        assert result.val == 2;
    }
}
