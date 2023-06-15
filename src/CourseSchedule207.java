// Depth-First Search, Breadth-First Search, Graph, Topological Sort

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class CourseSchedule207 {
    private boolean dfs(int node, Map<Integer, List<Integer>> adjMap, Set<Integer> visited) {
        if (!adjMap.containsKey(node) || adjMap.get(node).size() == 0) {
            return true;
        }
        if (visited.contains(node)) {
            return false;
        }
        visited.add(node);
        for (int nei : adjMap.get(node)) {
            if (!this.dfs(nei, adjMap, visited)) {
                return false;
            }
        }
        adjMap.put(node, new ArrayList<>());
        visited.remove(node);
        return true;
    }

    /*
        V:# of courses, E:# of dependencies
        Time Complexity : O(V+E)
        Space Complexity : O(V+E)
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adjMap = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            if (!adjMap.containsKey(prerequisite[0])) {
                adjMap.put(prerequisite[0], new ArrayList<>());
            }
            adjMap.get(prerequisite[0]).add(prerequisite[1]);
        }
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < numCourses; i++) {
            if (!this.dfs(i, adjMap, visited)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = new int[][]{{1, 0}};
        System.out.println(new CourseSchedule207().canFinish(numCourses, prerequisites)); // true
    }
}
