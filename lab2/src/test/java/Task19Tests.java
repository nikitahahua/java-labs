import org.example.Task14;
import org.example.Task19;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Task19Tests {
    private Task19 taskForTest;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        taskForTest = new Task19();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void getIsArrayUniqueTest(){
        int[] a = new int[]{1,3,4,5,5};
        String expectedOutput = "index: 0 value: 1\n" +
                                "index: 1 value: 3\n" +
                                "index: 2 value: 4\n";
        taskForTest.displayUniqueArrayValues(a);
        Assert.assertEquals(expectedOutput, outContent.toString());
    }
}
