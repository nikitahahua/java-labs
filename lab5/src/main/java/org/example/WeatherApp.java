package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class WeatherApp{
    List<Weather> weatherRecords = new ArrayList<>();

    @Data
    @AllArgsConstructor
    public static class Weather {

        private Direction direction;
        private double speed; // km/hour
        private double temperature;
        private String cloudiness;
        private String precipitation;

        @Override
        public String toString() {
            return String.format(
                    "Weather [Direction: %s, Speed: %.2f km/h, Temperature: %.2f °C, Cloudiness: %s, Precipitation: %s]",
                    direction, speed, temperature, cloudiness, precipitation
            );
        }
    }
    public void addWeatherRecord(Scanner scanner) {
        System.out.println("\nAdd Weather Record");

        System.out.print("Enter wind direction (NORTH, SOUTH, EAST, WEST, NORTHEAST, NORTHWEST, SOUTHEAST, SOUTHWEST): ");
        Direction direction = Direction.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Enter wind speed (km/h): ");
        double speed = scanner.nextDouble();

        System.out.print("Enter temperature (°C): ");
        double temperature = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter cloudiness (e.g., Clear, Partly Cloudy, Overcast): ");
        String cloudiness = scanner.nextLine();

        System.out.print("Enter precipitation (e.g., None, Rain, Snow): ");
        String precipitation = scanner.nextLine();

        Weather weather = new Weather(direction, speed, temperature, cloudiness, precipitation);
        weatherRecords.add(weather);

        System.out.println("Weather record added successfully!");
    }

    public void viewWeatherRecords() {
        if (weatherRecords.isEmpty()) {
            System.out.println("\nNo weather records available.");
        } else {
            System.out.println("\nWeather Records:");
            for (int i = 0; i < weatherRecords.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, weatherRecords.get(i));
            }
        }
    }
}

