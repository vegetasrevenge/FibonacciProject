package com.example;

import java.math.BigInteger;
import java.util.*;

public class MapProject {

    public static Map<Integer, BigInteger> results = new HashMap<>();

    public static BigInteger calcFibonacci (int index) {

        if (index == 0) {
            return results.get(index);
        }
        if(results.get(index) != null) {
            return results.get(index);
        } else {
            BigInteger index2 = calcFibonacci(index - 1).add(calcFibonacci(index - 2));
            results.put(index, index2);
            return index2;
        }
    }
}
