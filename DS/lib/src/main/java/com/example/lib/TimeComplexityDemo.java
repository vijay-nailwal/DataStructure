package com.example.lib;

import java.sql.Time;

public class TimeComplexityDemo {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();

        TimeComplexityDemo demo = new TimeComplexityDemo();
        System.out.println(demo.findsum(999));
        System.out.println("Time taken -" + (System.currentTimeMillis() - now) + " millisecs ");
    }

    private int findsum(int n) {
        return n * (n + 1) / 2;
    }
    /*private int findsum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }*/
}