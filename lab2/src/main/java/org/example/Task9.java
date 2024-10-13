package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task9 {
    public int[] task9(int[] a){
        List<Integer> parni = new ArrayList<>();
        List<Integer> neparni = new ArrayList<>();
        for (int value: a){
            if (value%2==0){
                parni.add(value);
            }
            else {
                neparni.add(value);
            }
        }
        parni.sort(Comparator.naturalOrder());
        neparni.sort(Comparator.reverseOrder());

        parni.addAll(neparni);

        int[] result = parni.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(result));
        return result;
    }
}
