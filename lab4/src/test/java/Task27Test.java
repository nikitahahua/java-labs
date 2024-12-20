import org.example.Task27;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Task27Test {

    @Test
    public void testDisplayStudents() {
        ArrayList<Task27.Student> students = new ArrayList<>();
        students.add(new Task27.Student("Ivan Ivanov", "Group A", new Task27.BirthDate(2000, 5, 12), 4.5f));
        students.add(new Task27.Student("Petro Petrov", "Group B", new Task27.BirthDate(2001, 3, 22), 3.8f));

        String expectedOutput =
                "Full Name: Ivan Ivanov, Group: Group A, Birth Date: 2000-5-12, Average Grade: 4.5\n" +
                        "Full Name: Petro Petrov, Group: Group B, Birth Date: 2001-3-22, Average Grade: 3.8\n";

        String result = captureOutput(() -> Task27.displayStudents(students));
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testEditStudent() {
        ArrayList<Task27.Student> students = new ArrayList<>();
        students.add(new Task27.Student("Ivan Ivanov", "Group A", new Task27.BirthDate(2000, 5, 12), 4.5f));

        Task27.Student newStudent = new Task27.Student("Ivan Ivanov Updated", "Group B", new Task27.BirthDate(1999, 4, 11), 4.9f);

        students.set(0, newStudent);

        assertEquals("Ivan Ivanov Updated", students.get(0).getFullName());
        assertEquals("Group B", students.get(0).getGroup());
        assertEquals(4.9f, students.get(0).getAverageGrade(), 0.001f);
        assertEquals(1999, students.get(0).getBirthDate().getYear());
        assertEquals(4, students.get(0).getBirthDate().getMonth());
        assertEquals(11, students.get(0).getBirthDate().getDay());
    }

    @Test
    public void testAddStudent() {
        ArrayList<Task27.Student> students = new ArrayList<>();
        students.add(new Task27.Student("Ivan Ivanov", "Group A", new Task27.BirthDate(2000, 5, 12), 4.5f));

        Task27.Student newStudent = new Task27.Student("Petro Petrov", "Group B", new Task27.BirthDate(2001, 3, 22), 3.8f);
        students.add(newStudent);

        assertEquals(2, students.size());
        assertEquals("Petro Petrov", students.get(1).getFullName());
        assertEquals("Group B", students.get(1).getGroup());
    }

    private String captureOutput(Runnable runnable) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        runnable.run();
        System.setOut(originalOut);
        return outputStream.toString();
    }
}
