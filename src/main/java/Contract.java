import java.util.Date;

public class Contract extends CalendarItem {
    private String counterparty;
    private double amount;

    public Contract(Date date, String title, String counterparty, double amount) {
        super(date, title);
        this.counterparty = counterparty;
        this.amount = amount;
    }

    public String getCounterparty() {
        return counterparty;
    }

    public void setCounterparty(String counterparty) {
        this.counterparty = counterparty;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Contract: " + getTitle() + " with " + counterparty + " on " + getDate());
        System.out.println("Amount: " + amount);
    }
}