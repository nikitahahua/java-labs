import org.example.Task14;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Task14Test {
    @Test
    public void testAbonentComparison() {
        Task14.Abonent abonent1 = new Task14.Abonent("Mykyta", "Hahua", "Olegovych", "Kyiv");
        Task14.Abonent abonent2 = new Task14.Abonent("Danil", "Voloshyn", "Bat'kovych", "Kharkiv");

        assertTrue("Abonent1 should be before Abonent2 based on surname.", abonent1.compareTo(abonent2) < 0);
    }


    @Test
    public void testAbonentToString() {
        Task14 task14 = new Task14();
        Task14.Abonent abonent = new Task14.Abonent("Olena", "Ivanova", "Petrovna", "Lviv");

        String expected = "Abonent{surname='Ivanova'}";
        assertEquals(expected, abonent.toString());
    }
}
