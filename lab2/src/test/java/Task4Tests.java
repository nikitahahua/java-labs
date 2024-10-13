import org.example.Task4;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class Task4Tests {

    private Task4 taskForTest;
    private int[] testArray;

    @Before
    public void setUP(){
        testArray = new int[]{1, 3, 4, 5, 5, 6};
        taskForTest = new Task4();
    }

    @Test
    public void getArrayWithOffsetTest(){
        String input = "2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int[] expectedArray = {0, 0, 1, 3, 4, 5, 5, 6};
        int[] actualArray = taskForTest.getArrayWithOffset(testArray);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test

    public void getArrayWithOffsetTest_whenArrayIsEmpty(){
        String input = "2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int[] expectedArray = {0, 0};
        int[] actualArray = taskForTest.getArrayWithOffset(new int[]{});

        Assert.assertArrayEquals(expectedArray, actualArray);
    }
}
