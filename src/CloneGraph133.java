// Hash Table, Depth-First Search, Breadth-First Search, Graph

import java.util.Map;
import java.util.HashMap;

public class CloneGraph133 {
    public Node dfs(Node node, Map<Node, Node> mapping) {
        if (node == null) {
            return null;
        }
        if (mapping.containsKey(node)) {
            return mapping.get(node);
        }
        Node copy = new Node(node.val);
        mapping.put(node, copy);
        for (Node nei : node.neighbors) {
            copy.neighbors.add(this.dfs(nei, mapping));
        }
        return copy;
    }

    /*
        Time Complexity: O(N + M), where N is a number of nodes (vertices) and M is a number of edges.

        Space Complexity: O(N). This space is occupied by the visited hash map
        and in addition to that, space would also be occupied by the recursion stack
        since we are adopting a recursive approach here.
        The space occupied by the recursion stack would be equal to O(H)
        where H is the height of the graph. Overall, the space complexity would be O(N).
     */
    public Node cloneGraph(Node node) {
        Map<Node, Node> mapping = new HashMap<>();
        return this.dfs(node, mapping);
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);
        System.out.println(new CloneGraph133().cloneGraph(node1));
    }
}
