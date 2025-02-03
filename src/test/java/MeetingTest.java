import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class MeetingTest {

    @Test
    void testMeetingCreation() {
        Date date = new Date();
        Meeting meeting = new Meeting(date, "Project Discussion", "Conference Room A", Arrays.asList("Alice", "Bob"));

        // Проверка равенства
        assertEquals("Project Discussion", meeting.getTitle());
        assertEquals(date, meeting.getDate());
        assertEquals("Conference Room A", meeting.getLocation());
        assertEquals(Arrays.asList("Alice", "Bob"), meeting.getParticipants());

        // Проверка истинности
        assertTrue(meeting.getParticipants().contains("Alice"));
        assertFalse(meeting.getParticipants().contains("Charlie"));
    }

    @Test
    void testMeetingLocationChange() {
        Meeting meeting = new Meeting(new Date(), "Project Discussion", "Conference Room A", Arrays.asList("Alice", "Bob"));
        meeting.setLocation("Conference Room B");

        // Проверка равенства после изменения
        assertEquals("Conference Room B", meeting.getLocation());
    }
}
