import org.example.Main;
import org.example.Task4;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class Task4Test {

    @Test
    public void testMenuOption1() {
        String userInput = "1\n3\n";
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        try {
            Task4 task4 = new Task4();
            task4.task4();
            String output = out.toString();
            assertTrue(output.contains("Welcome"));
            assertTrue(output.contains("exit"));
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }

    @Test
    public void testMenuOption2() {
        String userInput = "2\n5\n10\n3\n";
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));

        try {
            Task4 task4 = new Task4();
            task4.task4();
            String output = out.toString();
            assertTrue(output.contains("Sum: 15"));
            assertTrue(output.contains("exit"));
        } finally {
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }
}
