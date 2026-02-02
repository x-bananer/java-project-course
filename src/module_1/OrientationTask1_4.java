package module_1;

import java.util.*;

public class OrientationTask1_4 {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1: Add customer");
            System.out.println("2: Remove customer");
            System.out.println("Enter 0 to exit");
            System.out.println("");

            int userInput = scanner.nextInt();

            if (userInput == 0) {
                break;
            }

            if (userInput == 1) {
                Customer customer = new Customer(System.nanoTime());
                queue.addFirst(customer);
                System.out.println("New customer: " + customer.getId());
            }

            if (userInput == 2) {
                Customer customer = queue.removeLast();
                customer.setEndTime(System.nanoTime());
                System.out.println("Customer " + customer.getId() + ", time in queue: " + customer.getTimeSpent());
            }
        }
    }
}
