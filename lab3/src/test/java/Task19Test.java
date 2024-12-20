import org.example.Task19;
import org.example.Task4;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Task19Test {

    @Test
    public void test19() {
        Task19 task19 = new Task19();
        Map<String, String> result = task19.task19(List.of("01231231", "0123", "123"));

        assertEquals("Octal", result.get("01231231"));
        assertEquals("String", result.get("0123"));
        assertEquals("String", result.get("123"));
    }
}
