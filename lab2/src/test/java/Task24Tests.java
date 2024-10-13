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
        int day = 15, month = 5; // 15.05
        boolean isLeap = false;

        int result = taskForTest.getNumberOfTheDay(day, month, isLeap);

        int expected = 135;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void getNumberOfTheDayInTheYear_whenYearIsLeap(){
        int day = 15, month = 5; // 15.05
        boolean isLeap = true;

        int result = taskForTest.getNumberOfTheDay(day, month, isLeap);

        int expected = 136;
        Assert.assertEquals(result, expected);
    }
}
