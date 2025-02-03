import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void testTaskCreation() {
        Date date = new Date();
        Task task = new Task(date, "Prepare Report", false);

        // Проверка равенства
        assertEquals("Prepare Report", task.getTitle());
        assertEquals(date, task.getDate());
        assertFalse(task.isCompleted());

        // Проверка истинности
        assertTrue(task.getTitle().startsWith("Prepare"));
    }

    @Test
    void testTaskCompletion() {
        Task task = new Task(new Date(), "Prepare Report", false);
        task.setCompleted(true);

        // Проверка истинности
        assertTrue(task.isCompleted());
    }
}