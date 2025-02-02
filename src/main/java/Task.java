import java.util.Date;

public class Task extends CalendarItem {
    private boolean isCompleted;

    public Task(Date date, String title, boolean isCompleted) {
        super(date, title);
        this.isCompleted = isCompleted;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public void displayDetails() {
        System.out.println("Task: " + getTitle() + " on " + getDate());
        System.out.println("Status: " + (isCompleted ? "Completed" : "Not Completed"));
    }
}