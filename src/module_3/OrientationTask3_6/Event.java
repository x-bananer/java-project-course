package module_3.OrientationTask3_6;

public class Event implements Comparable<Event> {
    private double eventTime;
    private EventType eventType;

    public Event(double eventTime, EventType eventType) {
        this.eventTime = eventTime;
        this.eventType = eventType;
    }

    public int compareTo(Event event) {
        return Double.compare(this.eventTime, event.eventTime);
    }

    public String toString() {
        return "Event time: " + eventTime + ". Event type: " + eventType;
    }
}
