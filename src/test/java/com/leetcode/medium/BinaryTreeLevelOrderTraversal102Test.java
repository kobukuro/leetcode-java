package com.leetcode.medium;

import com.leetcode.datastructure.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class BinaryTreeLevelOrderTraversal102Test {
    private BinaryTreeLevelOrderTraversal102 solution;

    @BeforeEach
    void setUp() {
        solution = new BinaryTreeLevelOrderTraversal102();
    }

    @Test
    void testLevelOrder_Example1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> expected = Arrays.asList(
                List.of(3),
                Arrays.asList(9, 20),
                Arrays.asList(15, 7)
        );

        List<List<Integer>> result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.levelOrder(root));

        assertEquals(expected, result);
    }

    @Test
    void testLevelOrder_Example2() {
        TreeNode root = new TreeNode(1);
        List<List<Integer>> expected = List.of(
                List.of(1)
        );

        List<List<Integer>> result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.levelOrder(root));

        assertEquals(expected, result);
    }

    @Test
    void testLevelOrder_Example3() {
        List<List<Integer>> expected = new ArrayList<>();

        List<List<Integer>> result = assertTimeoutPreemptively(Duration.ofMillis(100), () -> solution.levelOrder(null));

        assertEquals(expected, result);
    }
}
