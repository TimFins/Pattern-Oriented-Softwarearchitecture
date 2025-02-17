package Adapter.SensorAdapter;

public abstract class Sensor {
    public int uid;

    public Sensor(int uid) {
        this.uid = uid;
    }

    public abstract void getData();
}
