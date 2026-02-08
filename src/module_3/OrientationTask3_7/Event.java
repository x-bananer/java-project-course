package module_3.OrientationTask3_7;

public class Event implements Comparable<Event> {
    private long time;
    private EventType type;

    public Event(long time, EventType type) {
        this.time = time;
        this.type = type;
    }
    
    public long getTime() {
        return time;
    }

    @Override
    public int compareTo(Event event) {
        return Long.compare(this.time, event.time);
    }

    public String toString() {
        return "Event time: " + time + ". Event type: " + type;
    }
}
