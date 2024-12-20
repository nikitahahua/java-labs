import org.example.Queue;import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {

    private Queue queue = new Queue();

    @Test
    public void testEnqueueAndDequeue() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());

        queue.enqueue(1);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testIsFull() {
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        assertTrue(queue.isFull());
    }

    @Test
    public void testOverflow() {
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }

        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> queue.enqueue(11));
        assertEquals("Черга переповнена", exception.getMessage());
    }

    @Test
    public void testUnderflow() {
        IllegalStateException exception = assertThrows(IllegalStateException.class, queue::dequeue);
        assertEquals("Черга порожня", exception.getMessage());
    }

    @Test
    public void testEnqueueAfterDequeue() {
        queue.enqueue(1);
        queue.enqueue(2);

        assertEquals(1, queue.dequeue());

        queue.enqueue(3);
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
    }
}
