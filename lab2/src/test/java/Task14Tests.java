import org.example.Task14;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task14Tests {

    private Task14 taskForTest;

    @Before
    public void setUp(){
        taskForTest = new Task14();
    }

    @Test
    public void getIsArrayUniqueTest(){
        int[] arrayForTest = new int[]{1,2,3,4};
        boolean expected = true;
        boolean result = taskForTest.isArrayUnique(arrayForTest);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void getIsArrayUniqueTest_whenContainsDuplicates(){
        int[] arrayForTest = new int[]{1,2,3,4,4};
        boolean expected = false;
        boolean result = taskForTest.isArrayUnique(arrayForTest);
        Assert.assertEquals(result, expected);
    }
}
