package module_3.OrientationTask3_5;

public class Clock {
    // luokan ainoa instanssi
    private static Clock instance;

    // simulaation nykyinen aika
    private double time = 0;

    // yksityinen konstruktori, new Clock() ei ole sallittu
    private Clock() {}

    // hae ainoa instanssi
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    // aseta aika
    public void setTime(double time) {
        this.time = time;
    }

    // hae aika
    public double getTime() {
        return time;
    }
}
