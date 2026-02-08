package module_3.OrientationTask3_7;

import eduni.distributions.Negexp;
public class ArrivalProcess {
    private EventType eventType;
    private Negexp generator;
    private Clock clock = Clock.getInstance();

    public ArrivalProcess(EventType eventType, Negexp generator) {
        this.eventType = eventType;
        this.generator = generator;
    }

    public void addEvent(EventList events) {
        long interval = (long) (generator.sample() * 1000);

        long newTime = clock.getTime() + interval;
        clock.setTime(newTime);

        Event event = new Event(newTime, eventType);
        events.add(event);
    }
}
