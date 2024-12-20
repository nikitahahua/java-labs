package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.Scanner;

public class Task27 {

    @Data
    public static class BirthDate {
        int year;
        int month;
        int day;

        public BirthDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @Override
        public String toString() {
            return year + "-" + month + "-" + day;
        }
    }

    @Data
    public static class Student {
        String fullName;
        String group;
        BirthDate birthDate;
        float averageGrade;

        public Student(String fullName, String group, BirthDate birthDate, float averageGrade) {
            this.fullName = fullName;
            this.group = group;
            this.birthDate = birthDate;
            this.averageGrade = averageGrade;
        }

        @Override
        public String toString() {
            return "Full Name: " + fullName + ", Group: " + group + ", Birth Date: " + birthDate + ", Average Grade: " + averageGrade;
        }
    }

    ArrayList<Student> students = new ArrayList<>();

    public void startTask27() {
        students.add(new Student("Ivan Ivanov", "Group A", new BirthDate(2000, 5, 12), 4.5f));
        students.add(new Student("Petro Petrov", "Group B", new BirthDate(2001, 3, 22), 3.8f));
        students.add(new Student("Svitlana Svitlana", "Group A", new BirthDate(1999, 8, 15), 4.9f));
        students.add(new Student("Andriy Andriychuk", "Group C", new BirthDate(2000, 11, 30), 3.6f));
        students.add(new Student("Olena Olenska", "Group B", new BirthDate(2001, 1, 5), 4.2f));

        System.out.println("List of students:");
        displayStudents(students);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the index of the student to edit (0-4): ");
        int index = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter new full name (current: " + students.get(index).fullName + "): ");
        String newFullName = scanner.nextLine();

        System.out.println("Enter new group (current: " + students.get(index).group + "): ");
        String newGroup = scanner.nextLine();

        System.out.println("Enter new average grade (current: " + students.get(index).averageGrade + "): ");
        float newAverageGrade = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Enter new birth year (current: " + students.get(index).birthDate.year + "): ");
        int newYear = scanner.nextInt();
        System.out.println("Enter new birth month (current: " + students.get(index).birthDate.month + "): ");
        int newMonth = scanner.nextInt();
        System.out.println("Enter new birth day (current: " + students.get(index).birthDate.day + "): ");
        int newDay = scanner.nextInt();

        students.set(index, new Student(newFullName, newGroup, new BirthDate(newYear, newMonth, newDay), newAverageGrade));

        System.out.println("\nUpdated list of students:");
        displayStudents(students);
    }

    public static void displayStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
