package Adapter.SensorAdapter;

public class OldSensor {
    public int uid;

    public OldSensor(int uid) {
        this.uid = uid;
    }

    public String getOldData() {
        return "Some data from a old sensor.";
    }
}
