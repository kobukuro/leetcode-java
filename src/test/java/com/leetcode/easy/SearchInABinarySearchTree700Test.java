package com.leetcode.easy;

import com.leetcode.datastructure.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SearchInABinarySearchTree700Test {
    private SearchInABinarySearchTree700 solution;

    @BeforeEach
    void setUp() {
        solution = new SearchInABinarySearchTree700();
    }

    @Test
    void testSearchBST_Example1() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int val = 2;

        TreeNode result = solution.searchBST(root, val);

        assertEquals(result, root.left);
    }

    @Test
    void testSearchBST_Example2() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int val = 5;

        TreeNode result = solution.searchBST(root, val);

        assertNull(result);
    }
}
