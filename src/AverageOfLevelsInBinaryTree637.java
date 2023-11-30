import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageOfLevelsInBinaryTree637 {
    private void dfs(TreeNode node, int level, Map<Integer, List<Double>> mapping) {
        if (node == null) {
            return;
        }
        if (!mapping.containsKey(level)) {
            List<Double> vals = new ArrayList<>();
            vals.add((double) node.val);
            mapping.put(level, vals);
        } else {
            List<Double> vals = mapping.get(level);
            vals.add((double) node.val);
            mapping.put(level, vals);
        }
        this.dfs(node.left, level + 1, mapping);
        this.dfs(node.right, level + 1, mapping);
    }

    public List<Double> averageOfLevels(TreeNode root) {
        Map<Integer, List<Double>> mapping = new HashMap<>();
        this.dfs(root, 1, mapping);
        List<Double> res = new ArrayList<>();
        for (Map.Entry<Integer, List<Double>> entry : mapping.entrySet()) {
            double sum = 0;
            for (double val : entry.getValue()) {
                sum += val;
            }
            res.add(sum / entry.getValue().size());
        }
        return res;
    }
}
