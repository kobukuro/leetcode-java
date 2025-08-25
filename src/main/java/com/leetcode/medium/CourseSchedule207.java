// Tags: DFS, Graph
package com.leetcode.medium;

import java.util.*;

public class CourseSchedule207 {
    private boolean dfs(int courseId, Map<Integer, List<Integer>> adjList, Set<Integer> visited) {
        if (visited.contains(courseId)) {
            return false;
        }
        visited.add(courseId);
        for (int prerequisite : adjList.get(courseId)) {
            if (!this.dfs(prerequisite, adjList, visited)) {
                return false;
            }
        }
        adjList.put(courseId, new ArrayList<>());
        visited.remove(courseId);
        return true;
    }

    /*
        V:# of courses, E:# of dependencies
        Time complexity: O(V+E)
        Space complexity: O(V+E)
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.put(i, new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            adjList.get(prerequisite[0]).add(prerequisite[1]);
        }
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < numCourses; i++) {
            if (!this.dfs(i, adjList, visited)) {
                return false;
            }
        }
        return true;
    }
}
