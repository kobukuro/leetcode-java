package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DesignParkingSystem1603Test {

    @Test
    void testAddCar_Example1() {
        DesignParkingSystem1603 parkingSystem = new DesignParkingSystem1603(1, 1, 0);

        boolean result1 = parkingSystem.addCar(1); // big car - true
        boolean result2 = parkingSystem.addCar(2); // medium car - true
        boolean result3 = parkingSystem.addCar(3); // small car - false (no slots)
        boolean result4 = parkingSystem.addCar(1); // big car - false (already occupied)

        assertTrue(result1);
        assertTrue(result2);
        assertFalse(result3);
        assertFalse(result4);
    }
}
