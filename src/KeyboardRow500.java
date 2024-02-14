import java.util.*;

public class KeyboardRow500 {
    public String[] findWords(String[] words) {
        String firstRowString = "qwertyuiop";
        Set<Character> firstHashSet = new HashSet<>();
        for (char c : firstRowString.toCharArray()) {
            firstHashSet.add(c);
        }
        String secondRowString = "asdfghjkl";
        Set<Character> secondHashSet = new HashSet<>();
        for (char c : secondRowString.toCharArray()) {
            secondHashSet.add(c);
        }
        String thirdRowString = "zxcvbnm";
        Set<Character> thirdHashSet = new HashSet<>();
        for (char c : thirdRowString.toCharArray()) {
            thirdHashSet.add(c);
        }
        List<String> resList = new ArrayList<>();
        for (String word : words) {
            Map<Integer, Integer> count = new HashMap<>();
            for (char c : word.toCharArray()) {
                c = Character.toLowerCase(c);
                if (firstHashSet.contains(c)) {
                    count.put(1, count.getOrDefault(1, 0) + 1);
                }
                if (secondHashSet.contains(c)) {
                    count.put(2, count.getOrDefault(2, 0) + 1);
                }
                if (thirdHashSet.contains(c)) {
                    count.put(3, count.getOrDefault(3, 0) + 1);
                }
            }
            if (count.size() == 1) {
                resList.add(word);
            }
        }
        return resList.toArray(new String[0]);
    }
}
