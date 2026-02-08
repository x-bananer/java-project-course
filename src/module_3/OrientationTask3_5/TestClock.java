package module_3.OrientationTask3_5;

public class TestClock {
    public static void main(String[] args) {
        Clock clock1 = Clock.getInstance();
        clock1.setTime(10);

        Clock clock2 = Clock.getInstance();
        System.out.println(clock2.getTime()); // tulostaa 10

        // clock1 ja clock2 ovat sama objekti
    }
}
