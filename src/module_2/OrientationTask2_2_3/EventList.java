package module_2.OrientationTask2_2_3;

import java.util.PriorityQueue;

public class EventList {
   public static void main(String[] args) {
       Event event1 = new Event(5, EventType.ARRIVAL);
       Event event2 = new Event(12, EventType.EXIT);
       Event event3 = new Event(3, EventType.ARRIVAL);

       PriorityQueue<Event> eventQueue = new PriorityQueue<>();

       eventQueue.add(event1);
       eventQueue.add(event2);
       eventQueue.add(event3);

       while (eventQueue.size() > 0) {
           System.out.println(eventQueue.remove().toString());
       }
   }
}
