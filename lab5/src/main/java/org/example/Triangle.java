package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public void setSideA(double sideA) {
        if (sideA <= 0) {
            throw new IllegalArgumentException("Сторона повинна бути більшою за 0");
        }
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        if (sideB <= 0) {
            throw new IllegalArgumentException("Сторона повинна бути більшою за 0");
        }
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        if (sideC <= 0) {
            throw new IllegalArgumentException("Сторона повинна бути більшою за 0");
        }
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalArgumentException("Сума двох сторін повинна бути більшою за третю");
        }
        this.sideC = sideC;
    }
}

