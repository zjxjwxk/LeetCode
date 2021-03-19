package com.zjxjwxk.leetcode._1603_Design_Parking_System;

/**
 * @author Xinkang Wu
 * @date 2021/3/19 12:02
 */
public class ParkingSystem {

    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (big > 0) {
                    --big;
                    return true;
                }
                return false;
            case 2:
                if (medium > 0) {
                    --medium;
                    return true;
                }
                return false;
            case 3:
                if (small > 0) {
                    --small;
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
