package module_3.OrientationTask3_7;

import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();

    public void addCustomer(Customer customer) {
        queue.add(customer);
    }

    public Customer pollCustomer() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}
