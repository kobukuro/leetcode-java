import java.util.ArrayList;
import java.util.List;

public class SeparateTheDigitsInAnArray2553 {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            String str = Integer.toString(num);
            char[] chars = str.toCharArray();
            for (char c : chars) {
                list.add(Character.getNumericValue(c));
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
