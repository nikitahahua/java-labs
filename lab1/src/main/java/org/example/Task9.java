package org.example;

import java.util.Scanner;

public class Task9 {
    public void getAPow15() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int A = scanner.nextInt();

        int B, C;
        B = A * A;
        System.out.println("A^2 :\t " + B);
        C = B * A;
        System.out.println("A^3 :\t " + C);
        A = B * C;
        System.out.println("A^5 :\t" + A);
        B = B * A * C;
        System.out.println("A^10:\t " + B);
        C = B * A;
        System.out.println("A^15:\t " + C);
    }
}
