import org.example.task4;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task4Test {


    @Test
    public void testAddElement() {
        task4 task = new task4();
        task.addElement(10);
        List<Integer> arrayList = task.getArrayList();
        assertTrue(arrayList.contains(10), "Element should be added to the list.");

        task.addElement(10);
        assertEquals(1, arrayList.stream().filter(e -> e == 10).count(), "Element should only appear once.");
    }

    @Test
    public void testDisplaySortedAscending() {
        task4 task = new task4();
        task.addElement(20);
        task.addElement(5);
        task.addElement(15);
        task.addElement(10);

        task.displaySorted(true);
        List<Integer> sortedList = task.getArrayList();
        assertTrue(sortedList.get(0) < sortedList.get(1), "The list should be sorted in ascending order.");
    }

    @Test
    public void testDisplaySortedDescending() {
        task4 task = new task4();

        task.addElement(5);
        task.addElement(10);
        task.addElement(15);
        task.addElement(20);

        task.displaySorted(false);
        List<Integer> sortedList = task.getArrayList();
        assertTrue(sortedList.get(0) > sortedList.get(1), "The list should be sorted in descending order.");
    }
}