package org.example;

import java.util.Scanner;

public class Task14 {
    public void getHeightAndHypotenuse(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перший катет: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть другий катет: ");
        double b = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        double area = 0.5 * a * b;
        double height = (2 * area) / hypotenuse;

        System.out.println("Hypotenuse: " + hypotenuse);
        System.out.println("Height: " + height);
    }
}
