package module_3.OrientationTask3_7;

import java.util.ArrayList;

public class EventList {
    private ArrayList<Event> events = new ArrayList<>();

    public void add(Event event) {
        events.add(event);
    }

    public ArrayList<Event> getEvents() {
        return events;
    };

    public Event poll() {
        if (events.isEmpty()) {
            return null;
        }
        return events.remove(0);
    }

    public Boolean isEmpty() {
        return events.isEmpty();
    }

    @Override
    public String toString() {
        String eventsString = "";

        for (Event event : events) {
            eventsString = eventsString + event.toString() + "\n";
        }

        return eventsString;
    }
}
