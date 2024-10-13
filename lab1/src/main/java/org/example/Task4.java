package org.example;

import java.util.Scanner;

public class Task4 {
    public void getNaturalLogFromNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        StringBuilder word = new StringBuilder(scanner.next());

        int myNumber = Integer.parseInt(word.reverse().toString());
        if (myNumber < 100 || myNumber > 999) {
            System.out.println("Число повинно бути тризначним!");
            return;
        }

        System.out.print("Actual number: " + myNumber + "\n");
        double result = Math.log(myNumber);
        System.out.printf("your log : " + result);
    }
}
