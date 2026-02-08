package demo;

public class TestClock {
    public static void main(String[] args) {
        Clock clock1 = Clock.getInstance();
        clock1.setTime(10);

        Clock clock2 = Clock.getInstance();
        System.out.println(clock2.getTime()); // выведет 10

        // clock1 и clock2 — это один и тот же объект
    }
}
