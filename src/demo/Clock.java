package demo;

public class Clock {

    // единственный экземпляр класса
    private static Clock instance;

    // текущее время симуляции
    private double time = 0;

    // приватный конструктор — снаружи new Clock() сделать нельзя
    private Clock() {}

    // получить единственный экземпляр
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    // установить время
    public void setTime(double time) {
        this.time = time;
    }

    // получить время
    public double getTime() {
        return time;
    }
}
