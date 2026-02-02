package module_1;

public class OrientationTask1_3 {
    public static void main(String[] args) {
        Customer customer = new Customer(1000);
        customer.setEndTime(2500);
        System.out.println(customer.getTimeSpent());
    }
}
