package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {

    public void task4() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        List<String> dataToAlalyze = new ArrayList<>();
        while (!exit) {
            System.out.println("Меню: \n" +
                    "1. Показати привітання\n" +
                    "2. Аналізувати типи аргументів\n" +
                    "3. Шифрування/Дешифрування\n" +
                    "4. аналіз ідентифікаторів мови С\n" +
                    "5. Вийти\n" +
                    "Введіть номер команди: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Welcome");
                    break;
                case 2:
                    System.out.print("Enter values to analyze: \n");
                    while (scanner.hasNext()) {
                        String value = scanner.next();
                        if (value.equals("exit")) {
                            exit = true;
                            break;
                        }
                        dataToAlalyze.add(value);
                    }
                    Task19 task19 = new Task19();
                    task19.task19(dataToAlalyze);
                    dataToAlalyze.clear();
                    break;
                case 3:
                    System.out.println("Меню шифрування/дешифрування: \n" +
                            "1. Зашифрувати текст\n" +
                            "2. Розшифрувати текст\n" +
                            "3. Вийти з режиму шифрування\n" +
                            "Введіть номер команди: ");
                    int subChoice = scanner.nextInt();
                    scanner.nextLine();
                    Task14 task14 = new Task14();
                    switch (subChoice) {
                        case 1:
                            System.out.print("Введіть текст для шифрування: ");
                            String plaintext = scanner.nextLine();
                            System.out.print("Введіть ключ тієї ж довжини: ");
                            String encryptionKey = scanner.nextLine();

                            if (plaintext.length() != encryptionKey.length()) {
                                System.out.println("Помилка: довжина ключа повинна збігатися з довжиною тексту.");
                            } else {
                                String encryptedText = task14.encrypt(plaintext, encryptionKey);
                                System.out.println("Зашифрований текст: " + encryptedText);
                            }
                            break;

                        case 2:
                            System.out.print("Введіть текст для дешифрування: ");
                            String ciphertext = scanner.nextLine();
                            System.out.print("Введіть ключ тієї ж довжини: ");
                            String decryptionKey = scanner.nextLine();

                            if (ciphertext.length() != decryptionKey.length()) {
                                System.out.println("Помилка: довжина ключа повинна збігатися з довжиною тексту.");
                            } else {
                                String decryptedText = task14.decrypt(ciphertext, decryptionKey);
                                System.out.println("Розшифрований текст: " + decryptedText);
                            }
                            break;

                        case 3:
                            System.out.println("Вихід з режиму шифрування.");
                            break;

                        default:
                            System.out.println("Невірна команда. Спробуйте ще раз.");
                    }
                    break;
                case 4:
                    System.out.print("Enter values to analyze: \n");
                    while (scanner.hasNext()) {
                        String value = scanner.next();
                        if (value.equals("exit")) {
                            exit = true;
                            break;
                        }
                        dataToAlalyze.add(value);
                    }
                    Task43 task43 = new Task43();
                    task43.task43(dataToAlalyze);
                    dataToAlalyze.clear();
                    break;
                case 5:
                    System.out.println("exit");
                    exit = true;
                    break;
                default:
                    System.out.println("try again");
            }
            System.out.println();
        }
        scanner.close();
    }
}
