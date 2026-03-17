// Tags: Design, Simulation, Counting
package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class DesignParkingSystem1603 {
    private final Map<Integer, Integer> spaces = new HashMap<>();

    public DesignParkingSystem1603(int big, int medium, int small) {
        this.spaces.put(1, big);
        this.spaces.put(2, medium);
        this.spaces.put(3, small);
    }

    public boolean addCar(int carType) {
        int remaining = this.spaces.get(carType);
        if (remaining == 0) {
            return false;
        }
        this.spaces.put(carType, remaining - 1);
        return true;

    }
}
