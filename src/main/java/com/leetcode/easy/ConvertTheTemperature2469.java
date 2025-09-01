// Tags: Math
package com.leetcode.easy;

public class ConvertTheTemperature2469 {
    /*
        Time complexity: O(1)
        Space complexity: O(1)
     */
    public double[] convertTemperature(double celsius) {
        return new double[] { celsius + 273.15, celsius * 1.8 + 32 };
    }
}
