import java.util.HashMap;
import java.util.Map;

public class Trie {
    private final Map<Character, Trie> links;
    private boolean isEnd;

    public Trie() {
        this.links = new HashMap<>();
        this.isEnd = false;
    }
    /*
        Time complexity : O(m), where m is the key length.
        In each iteration of the algorithm,
        we either examine or create a node in the trie till we reach the end of the key.
        This takes only m operations.

        Space complexity : O(m).
        In the worst case newly inserted key doesn't share
        a prefix with the keys already inserted in the trie.
        We have to add m new nodes, which takes us O(m) space.
     */

    public void insert(String word) {
        Trie curr = this;
        for (char w : word.toCharArray()) {
            if (!curr.links.containsKey(w)) {
                curr.links.put(w, new Trie());
            }
            curr = curr.links.get(w);
        }
        curr.isEnd = true;
    }

    /*
        Time complexity : O(m)
        In each step of the algorithm we search for the next key character.
        In the worst case the algorithm performs m operations.

        Space complexity : O(1)
     */
    public boolean search(String word) {
        Trie curr = this;
        for (char w : word.toCharArray()) {
            if (!curr.links.containsKey(w)) {
                return false;
            }
            curr = curr.links.get(w);
        }
        return curr.isEnd;
    }

    /*
        Time complexity : O(m)
        Space complexity : O(1)
     */
    public boolean startsWith(String prefix) {
        Trie curr = this;
        for (char w : prefix.toCharArray()) {
            if (!curr.links.containsKey(w)) {
                return false;
            }
            curr = curr.links.get(w);
        }
        return true;
    }
}
