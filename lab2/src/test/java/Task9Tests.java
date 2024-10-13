import org.example.Task9;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task9Tests {

    private Task9 taskForTest;

    @Before
    public void setUp() {

        taskForTest = new Task9();
    }

    @Test
    public void getSortedArrayTest() {
        int[] arrayForTest = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedArray = new int[]{2, 4, 6, 8, 9, 7, 5, 3, 1};
        int[] resultArray = taskForTest.task9(arrayForTest);
        Assert.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void getSortedArrayTest_whenDuplicatesExist() {
        int[] arrayForTest = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9};
        int[] expectedArray = new int[]{2, 4, 6, 8, 9, 9, 9, 7, 5, 3, 1};
        int[] resultArray = taskForTest.task9(arrayForTest);
        Assert.assertArrayEquals(expectedArray, resultArray);
    }
}
