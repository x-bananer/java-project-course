package module_3.OrientationTask3_7;

import eduni.distributions.Bernoulli;
import eduni.distributions.Negexp;

public class TestServicePoint {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();

        EventList events = new EventList();
        ArrivalProcess arrivalProcess = new ArrivalProcess(EventType.SELL_ARRIVAL, new Negexp(5));
        ServicePoint servicePoint = new ServicePoint();

        for (int i = 0; i < 10; i++) {
            arrivalProcess.addEvent(events);
        }

        System.out.println("Time of the last event: " + (clock.getTime() / 1000.0));

        while (!events.isEmpty()) {
            Event firstEvent = events.poll();
            Customer customer = new Customer(firstEvent.getTime());
            servicePoint.addCustomer(customer);
        }

        clock.setTime(clock.getTime() + 5);

        while (!servicePoint.isEmpty()) {
            Customer customer = servicePoint.pollCustomer();

            customer.setEndTime(clock.getTime());

            System.out.println("Customer " + customer.getId() + " spent " + (customer.getTimeSpent() / 1000) + " minutes in the system.");
        }
    }
}
