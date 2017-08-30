package com.example;


import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        MapProject mapProject = new MapProject();

        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        mapProject.results.put(0, BigInteger.valueOf(0l));
        mapProject.results.put(1, BigInteger.valueOf(1l));
        for (Integer i = 0; i < 1000000; i++) {
            System.out.println("calc(" + i + ") = " + mapProject.calcFibonacci(i));
        }
        endTime = System.currentTimeMillis();

        long totalTime = endTime - startTime;
        System.out.println("This process took " + totalTime + " milliseconds to complete.");
    }
}
