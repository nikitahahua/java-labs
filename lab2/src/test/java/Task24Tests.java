import org.example.Task14;
import org.example.Task24;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task24Tests {
    private Task24 taskForTest;

    @Before
    public void setUp(){
        taskForTest = new Task24();
    }

    @Test
    public void getNumberOfTheDayInTheYear_whenYearIsNotLeap(){
        int day = 1, month = 2; // 15.05
        boolean isLeap = false;

        int result = taskForTest.getNumberOfTheDay(day, month, isLeap);

        Assert.assertEquals(result+1, taskForTest.getNumberOfTheDay(day, month, true));
    }

    @Test
    public void getNumberOfTheDayInTheYear_whenYearIsLeap(){
        int day = 1, month = 3; // 15.05
        boolean isLeap = true;

        int result = taskForTest.getNumberOfTheDay(day, month, isLeap);

        int expected = 136;
        Assert.assertEquals(result, expected);
    }
}
