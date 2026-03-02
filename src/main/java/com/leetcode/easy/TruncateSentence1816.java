// Tags: String
package com.leetcode.easy;

public class TruncateSentence1816 {
    /**
     * Truncates the sentence to only contain the first k words.
     *
     * <p>A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
     * This method splits the input string and reconstructs it using only the first k words.</p>
     *
     * <h3>Algorithm:</h3>
     * <ol>
     *   <li>Split the input string by spaces to get all words</li>
     *   <li>Iterate through the first k words and append them to a StringBuilder</li>
     *   <li>Return the concatenated result as a String</li>
     * </ol>
     *
     * <h3>Time Complexity: O(n)</h3>
     * <ul>
     *   <li><b>split() operation:</b> O(n) - Scans the entire input string of length n once to find spaces</li>
     *   <li><b>For loop:</b> O(k) iterations × O(1) per iteration = O(k)</li>
     *   <li><b>StringBuilder appends:</b> O(m) total where m is total characters in first k words (amortized O(1) per append)</li>
     *   <li><b>toString() call:</b> O(m) to create the final String</li>
     *   <li><b>Total:</b> O(n) + O(k) + O(m) = O(n) since k ≤ n and m ≤ n</li>
     * </ul>
     *
     * <h3>Space Complexity: O(n)</h3>
     * <ul>
     *   <li><b>words array:</b> O(n) - Stores all word references and substring objects from split</li>
     *   <li><b>StringBuilder:</b> O(m) - Internal buffer stores up to m characters (first k words + spaces)</li>
     *   <li><b>Result String:</b> O(m) - New String object created from StringBuilder</li>
     *   <li><b>Total:</b> O(n) dominant, as the split array uses O(n) space regardless of k</li>
     * </ul>
     *
     * <h3>Example:</h3>
     * <pre>
     * Input: s = "Hello how are you", k = 2
     * Output: "Hello how"
     * Explanation: Returns only the first 2 words separated by a space
     * </pre>
     *
     * @param s the input sentence consisting of words separated by single spaces (length ≥ 1)
     * @param k the number of words to keep from the beginning (1 ≤ k ≤ number of words in s)
     * @return a new string containing only the first k words separated by spaces
     */
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (i > 0) res.append(" ");
            res.append(words[i]);
        }
        return res.toString();
    }
}
