package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public int[] getArrayWithOffset(int[] a){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int[] b = new int[a.length+k];

        for (int i = 0; i < a.length; i++) {
            b[i+k-1] = a[i];
        }
//        System.arraycopy(a, 0, b, k, a.length);

        System.out.println(Arrays.toString(b));
        return b;
    }
}
