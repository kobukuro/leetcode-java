// Tags: Array, String, Hash Set
package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses929 {

    /**
     * Returns the number of unique email addresses after applying normalization rules.
     * <p>
     * Normalization rules:
     * <ul>
     *   <li>Dots (.) in the local name are ignored</li>
     *   <li>Everything after the first plus (+) in the local name is ignored</li>
     * </ul>
     * <p>
     * <b>Time Complexity: O(N × L)</b>
     * <ul>
     *   <li>N = number of emails in the input array</li>
     *   <li>L = average length of an email address</li>
     *   <li>For each email, we perform:
     *     <ul>
     *       <li>split("@") - O(L) to scan and split the string</li>
     *       <li>replace(".", "") - O(L) to create new string without dots</li>
     *       <li>split("\\+") - O(L) to find and split at '+' character</li>
     *       <li>HashSet.add() - O(L) for hashing the string and O(1) average insertion</li>
     *     </ul>
     *   </li>
     *   <li>Total: O(N × L) since we process each character of each email a constant number of times</li>
     * </ul>
     * <p>
     * <b>Space Complexity: O(N × L)</b>
     * <ul>
     *   <li>HashSet stores up to N unique normalized emails</li>
     *   <li>Each normalized email has length O(L) in the worst case</li>
     *   <li>Additional temporary strings (split arrays, replaced strings) are O(L) each and get garbage collected</li>
     *   <li>Worst case: all N emails are unique → O(N × L) total storage</li>
     *   <li>Best case: all N emails normalize to the same address → O(L) storage</li>
     * </ul>
     *
     * @param emails array of email addresses to process
     * @return the count of unique email addresses
     */
    public int numUniqueEmails(String[] emails) {
        Set<String> emailHashSet = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String localName = parts[0].replace(".", "").split("\\+")[0];
            emailHashSet.add(localName + "@" + parts[1]);
        }
        return emailHashSet.size();
    }
}
