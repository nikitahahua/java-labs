package org.example;

public class Task24 {
    public int getNumberOfTheDay(int day, int month, boolean isLeap){
        int []startOfTheMonths = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 314, 334};

        return isLeap ?
                (month >= 2 ? startOfTheMonths[month-1] + day + 1 : startOfTheMonths[month-1] + day) :
                startOfTheMonths[month-1] + day;
    }
}
