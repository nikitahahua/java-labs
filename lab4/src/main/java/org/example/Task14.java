package org.example;

import lombok.Data;
import lombok.Getter;

import java.util.*;

@Getter
public class Task14{

    @Data
    public static class Abonent implements Comparable<Abonent> {
        private String name;
        private String surname;
        private String byFather;
        private String address;

        public Abonent(String name, String surname, String byFather, String address) {
            this.name = name;
            this.surname = surname;
            this.byFather = byFather;
            this.address = address;
        }

        @Override
        public int compareTo(Abonent o) {
            return this.surname.compareTo(o.surname);
        }

        @Override
        public String toString() {
            return "Abonent{" +
                    "surname='" + surname + '\'' +
                    '}';
        }
    }

    private Map<String, Abonent> clients = new HashMap<>();

    public void fillClients(){
        clients.put("0978110449", new Abonent("Mykyta", "Hahua", "Olegovych", "Kyiv"));
        clients.put("0674513843", new Abonent("Danil", "Voloshyn", "Bat'kovych", "Kharkiv"));
        clients.put("0501234567", new Abonent("Olena", "Ivanova", "Petrovna", "Lviv"));
        clients.put("0639876543", new Abonent("Andrii", "Shevchenko", "Dmytrovych", "Odesa"));
        clients.put("0951122334", new Abonent("Iryna", "Koval", "Mykhailivna", "Dnipro"));
    }

    public void removeAbonent(String phoneNumber) {
        if (clients.containsKey(phoneNumber)) {
            clients.remove(phoneNumber);
            System.out.println("Abonent with phone number " + phoneNumber + " has been removed.");
        } else {
            System.out.println("No abonent found with the phone number " + phoneNumber);
        }
    }

    public void sortedAbonents(Map<String, Abonent> clients) {
        Map<String, Abonent> sortedClients = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String phone1, String phone2) {
                return clients.get(phone2).getSurname().compareTo(clients.get(phone1).getSurname());
            }
        });

        sortedClients.putAll(clients);
        System.out.println(sortedClients);
    }
}

