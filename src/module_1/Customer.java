package module_1;

public class Customer {
    private static int nextId = 1;

    private int id;
    private long startTime;
    private long endTime;

    public Customer(long startTime) {
        this.id = nextId++;
        this.startTime = startTime;
    }

    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getTimeSpent() {
        return endTime - startTime;
    }
}
