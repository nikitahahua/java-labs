import org.example.Triangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Test14Task {

    @Test
    public void testGetPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12, triangle.getPerimeter(), 0.001);
    }

    @Test
    public void testGetArea() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6, triangle.getArea(), 0.001);
    }

    @Test
    public void testSetSides() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(3, triangle.getSideA(), 0.001);
        assertEquals(4, triangle.getSideB(), 0.001);
        assertEquals(5, triangle.getSideC(), 0.001);
    }

    @Test
    public void testSetNegativeSide() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangle(-1, 4, 5);
        });
        assertEquals("Сторона повинна бути більшою за 0", thrown.getMessage());
    }

    @Test
    public void testInvalidTriangle() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangle(1, 2, 3);
        });
        assertEquals("Сума двох сторін повинна бути більшою за третю", thrown.getMessage());
    }

    @Test
    public void testGetAreaForDifferentTriangle() {
        Triangle triangle = new Triangle(6, 8, 10);
        assertEquals(24, triangle.getArea(), 0.001);
    }
}
