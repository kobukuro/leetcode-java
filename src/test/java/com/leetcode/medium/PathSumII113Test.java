package com.leetcode.medium;

import com.leetcode.datastructure.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PathSumII113Test {
    private PathSumII113 solution;

    @BeforeEach
    public void setUp() {
        solution = new PathSumII113();
    }

    @Test
    void testPathSum_Example1() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        List<List<Integer>> expected = List.of(
                List.of(5, 4, 11, 2),
                List.of(5, 8, 4, 5)
        );

        List<List<Integer>> result = solution.pathSum(root, targetSum);

        assertEquals(expected, result);
    }

    @Test
    void testPathSum_Example2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        int targetSum = 5;

        List<List<Integer>> expected = List.of();

        List<List<Integer>> result = solution.pathSum(root, targetSum);

        assertEquals(expected, result);
    }

    @Test
    void testPathSum_Example3() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        int targetSum = 0;

        List<List<Integer>> expected = List.of();

        List<List<Integer>> result = solution.pathSum(root, targetSum);

        assertEquals(expected, result);
    }

    @Test
    void testPathSum_Example4() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        int targetSum = 1;

        List<List<Integer>> expected = List.of();

        List<List<Integer>> result = solution.pathSum(root, targetSum);

        assertEquals(expected, result);
    }
}
