package org.example;

import lombok.Data;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class Task19 {

    LinkedList<QueuePerson> queuePersons = new LinkedList<>();

    public LinkedList<QueuePerson> getQueuePersons() {
        return queuePersons;
    }

    public Task19() {
        queuePersons.add(new QueuePerson("John", "Doe", "Michael", 1,
                new QueuePerson.AddressValue("New York", "5th Avenue", "10", 101)));
        queuePersons.add(new QueuePerson("Jane", "Smith", "Ann", 2,
                new QueuePerson.AddressValue("Los Angeles", "Sunset Boulevard", "20", 202)));
        queuePersons.add(new QueuePerson("Robert", "Johnson", "William", 2,
                new QueuePerson.AddressValue("Chicago", "Lake Shore Drive", "30", 303)));
        queuePersons.add(new QueuePerson("Emily", "Davis", "Elizabeth", 4,
                new QueuePerson.AddressValue("Houston", "Main Street", "40", 0)));
        queuePersons.add(new QueuePerson("Michael", "Brown", "James", 1,
                new QueuePerson.AddressValue("Phoenix", "Grand Avenue", "50", 505)));

    }

    public void startTask19(){
        queuePersons.sort(Comparator.comparingInt(QueuePerson::getPriority));
    }

    public void addQueuePerson(QueuePerson person) {
        boolean added = false;
        for (ListIterator<QueuePerson> iterator = queuePersons.listIterator(); iterator.hasNext(); ) {
            QueuePerson currentPerson = iterator.next();
            if (person.getPriority() < currentPerson.getPriority()) {
                iterator.previous();
                iterator.add(person);
                added = true;
                break;
            }
        }
        if (!added) {
            queuePersons.add(person);
        }
    }

    private void printQueue(LinkedList<QueuePerson> queuePersons) {
        int currentPriority = -1;
        for (QueuePerson person : queuePersons) {
            if (person.getPriority() != currentPriority) {
                System.out.println("Priority " + person.getPriority() + ":");
                currentPriority = person.getPriority();
            }
            System.out.println(person);
        }

        System.out.println(calculatePriorityCounts(queuePersons));
    }

    public HashMap<Integer, Integer> calculatePriorityCounts(LinkedList<QueuePerson> queuePersons) {
        HashMap<Integer, Integer> priorityCountMap = new HashMap<>();
        for (QueuePerson person : queuePersons) {
            priorityCountMap.put(person.priority, priorityCountMap.getOrDefault(person.priority, 0) + 1);
        }
        return priorityCountMap;
    }

    @Data
    public static class QueuePerson{
        String name;
        String surname;
        String byFather;
        int priority;
        AddressValue addressValue;

        public static class AddressValue{
            String city;
            String street;
            String buildingNumber;
            int flatNumber;

            public AddressValue(String city, String street, String buildingNumber, int flatNumber) {
                this.city = city;
                this.street = street;
                this.buildingNumber = buildingNumber;
                this.flatNumber = flatNumber;
            }

            @Override
            public String toString() {
                return String.format("%s, %s, %s, %d", city, street, buildingNumber, flatNumber);
            }
        }

        public QueuePerson(String name, String surname, String byFather, int priority, AddressValue addressValue) {
            this.name = name;
            this.surname = surname;
            this.byFather = byFather;
            this.priority = priority;
            this.addressValue = addressValue;
        }

        @Override
        public String toString() {
            return String.format("%s %s %s (Priority: %d, Address: %s)", name, surname, byFather, priority, addressValue);
        }
    }
}
