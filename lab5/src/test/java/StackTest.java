import org.example.Stack;
import org.junit.Test;


import static org.junit.Assert.*;

public class StackTest {
    private Stack stack =new Stack();

    @Test
    public void testPushAndPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    public void testPeek() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());

        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testIsFull() {
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }

    @Test
    public void testOverflow() {
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> stack.push(11));
        assertEquals("Стек переповнений", exception.getMessage());
    }

    @Test
    public void testUnderflow() {
        IllegalStateException exception = assertThrows(IllegalStateException.class, stack::pop);
        assertEquals("Стек порожній", exception.getMessage());
    }

    @Test
    public void testPeekEmptyStack() {
        IllegalStateException exception = assertThrows(IllegalStateException.class, stack::peek);
        assertEquals("Стек порожній", exception.getMessage());
    }
}