package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        startTask4();
//        startTask9();
        startTask19();
    }

    public static void startTask4(){
        WeatherApp weatherApp = new WeatherApp();
        Scanner scanner = new Scanner(System.in);
        weatherApp.addWeatherRecord(scanner);
        weatherApp.viewWeatherRecords();
    }

    public static void startTask9(){
        try {
            Triangle triangle = new Triangle(3, 4, 5);
            System.out.println("Периметр: " + triangle.getPerimeter());
            System.out.println("Площа: " + triangle.getArea());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void startTask19(){
        SaleStorage saleStorage = new SaleStorage();
        Sale sale1 = new Sale("Телефон", "Samsung", "Олександр", 2, 20000, 40000);
        Sale sale2 = new Sale("Ноутбук", "Dell", "Марія", 1, 30000, 30000);
        Sale sale3 = new Sale("Планшет", "Apple", "Ігор", 3, 15000, 45000);
        saleStorage.addSale(sale1);
        saleStorage.addSale(sale2);
        saleStorage.addSale(sale3);
        saleStorage.getSales().forEach(System.out::println);
    }
}

