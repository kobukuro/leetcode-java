import java.util.List;
import java.util.ArrayList;

public class Node {
    public int val;
    public List<Node> neighbors;

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<>();
    }
}
