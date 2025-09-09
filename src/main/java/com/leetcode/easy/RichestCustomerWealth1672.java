// Tags: Array, Matrix
package com.leetcode.easy;

public class RichestCustomerWealth1672 {
    /*
        Let M be the number of customers and N be the number of banks.
        Time complexity: O(M⋅N)
        For each of the M customers,
        we need to iterate over all N banks to find the sum of his/her wealth.
        Hence, the total time complexity is O(M⋅N).

        Space complexity: O(1)
        We only need two variables personWealth and maxWealthSoFar
        to store the wealth of the current customer,
        and the highest wealth we have seen so far respectively.
        Therefore, the space complexity is constant.
     */
    public int maximumWealth(int[][] accounts) {
        int maxWealthSoFar = 0;
        for (int[] account : accounts) {
            int personWealth = 0;
            for (int money : account) {
                personWealth += money;
            }
            maxWealthSoFar = Math.max(maxWealthSoFar, personWealth);
        }
        return maxWealthSoFar;
    }
}
