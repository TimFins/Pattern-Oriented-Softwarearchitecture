package Adapter.SensorAdapter;

public class NewSensor extends Sensor {
    public NewSensor(int uid) {
        super(uid);
    }

    public void getData() {
        System.out.println("Some data from a new sensor");
    }
}
