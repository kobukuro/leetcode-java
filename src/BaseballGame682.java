import java.util.ArrayList;
import java.util.List;

public class BaseballGame682 {
    public int calPoints(String[] operations) {
        int res = 0;
        List<Integer> records = new ArrayList<>();
        for (String operation : operations) {
            if (operation.equals("+")) {
                int sum = records.get(records.size() - 1) + records.get(records.size() - 2);
                records.add(sum);
            } else if (operation.equals("D")) {
                int score = records.get(records.size() - 1) * 2;
                records.add(score);
            } else if (operation.equals("C")) {
                records.remove(records.size() - 1);
            } else {
                records.add(Integer.parseInt(operation));
            }
        }
        for (int record : records) {
            res += record;
        }
        return res;
    }
}
