package module_2.OrientationTask2_2_3;

public class Event implements Comparable<Event> {
    private int eventTime;
    private EventType eventType;

    public Event(int eventTime, EventType eventType) {
        this.eventTime = eventTime;
        this.eventType = eventType;
    }

    public int compareTo(Event event) {
        if (eventTime == event.eventTime) {
            return 0;
        } else if (eventTime > event.eventTime) {
            return 1;
        } else {
            return -1;
        }

        // shorter version:
        // return this.eventTime - event.eventTime;
    }

    public String toString() {
        return "Event time: " + eventTime + ". Event type: " + eventType;
    }
}
