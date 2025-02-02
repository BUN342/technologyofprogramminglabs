import java.util.Date;
import java.util.List;

public class Meeting extends CalendarItem {
    private String location;
    private List<String> participants;

    public Meeting(Date date, String title, String location, List<String> participants) {
        super(date, title);
        this.location = location;
        this.participants = participants;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    @Override
    public void displayDetails() {
        System.out.println("Meeting: " + getTitle() + " at " + location + " on " + getDate());
        System.out.println("Participants: " + String.join(", ", participants));
    }
}