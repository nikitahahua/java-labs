import org.example.Task43;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Task43Test {

    Task43 task43 = new Task43();

    @Test
    public void testValidKeywords() {
        List<String> words = Arrays.asList("if", "for", "while", "do", "else");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        task43.task43(words);

        String output = outContent.toString();
        assertTrue(output.contains("Argument: if | Type: Keyword"));
        assertTrue(output.contains("Argument: for | Type: Keyword"));
        assertTrue(output.contains("Argument: while | Type: Keyword"));
        assertTrue(output.contains("Argument: do | Type: Keyword"));
        assertTrue(output.contains("Argument: else | Type: Keyword"));
    }

    @Test
    public void testValidIdentifiers() {
        List<String> words = List.of("my_Var");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        outContent.reset();
        System.setOut(new PrintStream(outContent));
        task43.task43(words);

        String output = outContent.toString();
        assertTrue(output.contains("Argument: my_Var | Type: Identifier"));
    }

    @Test
    public void testInvalidArguments() {
        List<String> words = Arrays.asList("123invalid", "var-123", "ifelse", "!invalid");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        task43.task43(words);

        String output = outContent.toString();
        assertTrue(output.contains("Argument: 123invalid | Type: Illegal"));
        assertTrue(output.contains("Argument: var-123 | Type: Illegal"));
        assertTrue(output.contains("Argument: ifelse | Type: Illegal"));
        assertTrue(output.contains("Argument: !invalid | Type: Illegal"));
    }

    @Test
    public void testEmptyList() {
        List<String> words = Arrays.asList();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        task43.task43(words);

        String output = outContent.toString();
        assertTrue(output.contains("Amount of arguments: 0"));
    }
}
