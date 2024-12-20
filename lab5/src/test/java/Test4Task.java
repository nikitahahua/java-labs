import org.example.Direction;
import org.example.WeatherApp;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Test4Task {

    @Test
    public void testAddWeatherRecord() {
        WeatherApp weatherApp = new WeatherApp();

        String userInput = "NORTH\n15,5\n22,3\nPartly Cloudy\nNo precipitation\n";
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        try {
            weatherApp.addWeatherRecord(new Scanner(System.in));
            assertEquals(1, weatherApp.getWeatherRecords().size());

            WeatherApp.Weather weather = weatherApp.getWeatherRecords().get(0);
            assertEquals(Direction.NORTH, weather.getDirection());
            assertEquals(15.5, weather.getSpeed(), 0.01);
            assertEquals(22.3, weather.getTemperature(), 0.01);
            assertEquals("Partly Cloudy", weather.getCloudiness());
            assertEquals("No precipitation", weather.getPrecipitation());
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testViewWeatherRecords_WithRecords() {
        WeatherApp weatherApp = new WeatherApp();

        WeatherApp.Weather weather1 = new WeatherApp.Weather(
                Direction.NORTH, 10.5, 20.0, "Clear", "None"
        );
        WeatherApp.Weather weather2 = new WeatherApp.Weather(
                Direction.SOUTH, 5.3, 15.0, "Overcast", "Rain"
        );

        weatherApp.getWeatherRecords().add(weather1);
        weatherApp.getWeatherRecords().add(weather2);

        assertEquals(2, weatherApp.getWeatherRecords().size());

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        weatherApp.viewWeatherRecords();

        String output = outputStream.toString();
        assertTrue(output.contains("Clear"));
        assertTrue(output.contains("Overcast"));
        assertTrue(output.contains("NORTH"));
        assertTrue(output.contains("SOUTH"));
    }
}
