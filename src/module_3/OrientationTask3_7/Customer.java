package module_3.OrientationTask3_7;

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
    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getTimeSpent() {
        return endTime - startTime;
    }
}
