public class Thermostat {

    private String location;
    private int temperature;

    private static final int MIN = 16;
    private static final int MAX = 30;

    private static int activeCount = 0;

    public Thermostat(String location, int temperature) {
        this.location = location;

        if (temperature >= MIN && temperature <= MAX) {
            this.temperature = temperature;
        } else {
            this.temperature = 22;
        }

        activeCount++;
    }

    public Thermostat(String location) {
        this(location, 22);
    }

    public void raise() {
        if (temperature < MAX) {
            temperature++;
        } else {
            System.out.println("Already at Maximum 30");
        }
    }

    public void lower() {
        if (temperature > MIN) {
            temperature--;
        } else {
            System.out.println("Already at Minimum 16");
        }
    }

    public String getLocation() {
        return location;
    }

    public int getTemperature() {
        return temperature;
    }

    public static int getActiveCount() {
        return activeCount;
    }

    public static void main(String[] args) {

        Thermostat t1 = new Thermostat("Main");

        for (int i = 0; i < 10; i++) {
            t1.raise();
        }

        System.out.println("Temperature of t1: " + t1.getTemperature());

        Thermostat t2 = new Thermostat("Main");

        for (int i = 0; i < 20; i++) {
            t2.lower();
        }

        System.out.println("Temperature of t2: " + t2.getTemperature());
        System.out.println("Active thermostats: " + getActiveCount());
    }
}