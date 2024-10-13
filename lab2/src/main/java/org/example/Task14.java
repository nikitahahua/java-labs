package org.example;

import java.util.HashSet;

public class Task14 {
    public boolean isArrayUnique(int[] a){
        HashSet<Integer> mySet = new HashSet<>();
        for (int value: a){
            if (!mySet.add(value)){
                return false;
            }
        }
        return true;
    }
}
