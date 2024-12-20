package org.example;

import lombok.Getter;

import java.util.*;

@Getter
public class task4 {

    private final List<Integer> arrayList;
    private final TreeSet<Integer> treeSet;

    public task4() {
        Random random = new Random();
        arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(random.nextInt(50) + 1);
        }

        treeSet = new TreeSet<>(arrayList);
    }

    public void addElement(int element) {
        if (treeSet.contains(element)) {
            System.out.println("Element already exists: " + element);
        } else {
            arrayList.add(element);
            treeSet.add(element);
            System.out.println("Element added: " + element);
        }
    }

    public void displayList() {
        System.out.println("List elements: " + arrayList);
    }

    public void displaySorted(boolean ascending) {
        if (ascending) {
            arrayList.sort(Comparator.naturalOrder());
        } else {
            arrayList.sort(Comparator.reverseOrder());
        }
        System.out.println("Sorted list (" + (ascending ? "ascending" : "descending") + "): " + arrayList);
    }

    public void checkForDuplicates() {
        if (arrayList.size() > treeSet.size()) {
            System.out.println("Duplicates found.");
        } else {
            System.out.println("No duplicates found.");
        }
    }

    public void startTask4() {
        task4 manager = new task4();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display list");
            System.out.println("2. Add element");
            System.out.println("3. Display sorted list (ascending)");
            System.out.println("4. Display sorted list (descending)");
            System.out.println("5. Check for duplicates");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    manager.displayList();
                    break;
                case 2:
                    System.out.print("Enter an element to add: ");
                    int element = scanner.nextInt();
                    manager.addElement(element);
                    break;
                case 3:
                    manager.displaySorted(true);
                    break;
                case 4:
                    manager.displaySorted(false);
                    break;
                case 5:
                    manager.checkForDuplicates();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

