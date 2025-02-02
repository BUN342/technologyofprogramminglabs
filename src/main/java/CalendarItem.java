import java.util.Date;

public abstract class CalendarItem {
    private Date date;
    private String name;

    public CalendarItem(Date date, String title) {
        this.date = date;
        this.name = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return name;
    }

    public void setTitle(String title) {
        this.name = title;
    }

    public abstract void displayDetails();
}