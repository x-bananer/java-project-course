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

       System.out.println("\nEvents:");
       printQueue(eventQueue);

       Event removed = eventQueue.poll();
       System.out.println("\nRemoved event:\n" + removed);

       System.out.println("\nRemaining events:");
       printQueue(eventQueue);
   }

    private static void printQueue(PriorityQueue<Event> queue) {
        /* We print from a copy of the PriorityQueue because polling removes elements.
         * If we printed directly from eventQueue, it would be emptied.
         */
        PriorityQueue<Event> copyQueue = new PriorityQueue<>(queue);

        while (!copyQueue.isEmpty()) {
            System.out.println(copyQueue.poll());
        }
    }
}
