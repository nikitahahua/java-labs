import org.example.Task19;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task19Test {

    @Test
    public void testAddQueuePerson() {
        Task19.QueuePerson newPerson = new Task19.QueuePerson("Alice", "Williams", "Grace", 3,
                new Task19.QueuePerson.AddressValue("London", "Baker Street", "221B", 0));
        Task19 task19 = new Task19();
        task19.addQueuePerson(newPerson);
        LinkedList<Task19.QueuePerson> queue = task19.getQueuePersons();

        assertEquals("Alice Williams Grace (Priority: 3, Address: London, Baker Street, 221B, 0)", queue.get(3).toString());
    }

    @Test
    public void testCalculatePriorityCounts() {
        Task19 task19 = new Task19();
        task19.startTask19();

        HashMap<Integer, Integer> priorityCounts = task19.calculatePriorityCounts(task19.getQueuePersons());

        assertEquals(2, priorityCounts.get(1));
        assertEquals(2, priorityCounts.get(2));
        assertEquals(1, priorityCounts.get(4));
    }
}