package org.example;

import java.util.*;

public class Task19 {
    public void displayUniqueArrayValues(int[] a) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i : a) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }

        for (int i = 0; i < a.length; i++) {
            if (frequencyMap.get(a[i]) == 1) {
                System.out.println("index: " + i + " value: " + a[i]);
            }
        }
    }
}
