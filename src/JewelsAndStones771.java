import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones771 {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        Set<Character> jewelTypes = new HashSet<>();
        char[] jewelsChars = jewels.toCharArray();
        for (char jewel : jewelsChars) {
            jewelTypes.add(jewel);
        }
        char[] stonesChars = stones.toCharArray();
        for (char stone : stonesChars) {
            if (jewelTypes.contains(stone)) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(new JewelsAndStones771().numJewelsInStones(jewels, stones)); // 3
    }
}
