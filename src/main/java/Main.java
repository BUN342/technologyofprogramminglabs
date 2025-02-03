import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Создаем объекты
        Meeting meeting = new Meeting(new Date(), "Project Discussion", "Conference Room A", Arrays.asList("Alice", "Bob"));
        Task task = new Task(new Date(), "Prepare Report", false);
        Contract contract = new Contract(new Date(), "Software Development", "XYZ Corp", 10000.0);

        // Выводим детали
        displayCalendarItemDetails(meeting);
        displayCalendarItemDetails(task);
        //displayCalendarItemDetails(contract);
    }

    // Метод для вывода деталей CalendarItem
    public static void displayCalendarItemDetails(CalendarItem item) {
        item.displayDetails();
        System.out.println("-----------------------------");
    }
}