package org.example;

import java.util.Scanner;

public class Task19 {
    public void calculateSquare(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        System.out.print("Enter side d: ");
        double d = scanner.nextDouble();

        System.out.print("Enter diagonal e: ");
        double e = scanner.nextDouble();

        double area = calculateQuadrilateralArea(a, b, c, d, e);
        System.out.println("Area of the quadrilateral: " + area);

        scanner.close();
    }

    private double calculateTriangleArea(double a, double b, double e) {
        double s = (a + b + e) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - e));
    }

    private double calculateQuadrilateralArea(double a, double b, double c, double d, double e) {
        return calculateTriangleArea(a, b, e) + calculateTriangleArea(c, d, e);
    }
}
