package module_3.OrientationTask3_6;

import java.util.ArrayList;

public class EventList {
    private ArrayList<Event> events = new ArrayList<>();

    public void add(Event event) {
        events.add(event);
    }

    public ArrayList<Event> getEvents() {
        return events;
    };

    @Override
    public String toString() {
        String eventsString = "";

        for (Event event : events) {
            eventsString = eventsString + event.toString() + "\n";
        }

        return eventsString;
    }
}
