package Adapter.SensorAdapter;

public class OldSensorAdapter extends Sensor {
    OldSensor oldSensor;
    public OldSensorAdapter(int uid, OldSensor oldSensor) {
        super(uid);
        this.oldSensor = oldSensor;
    }

    public void getData() {
        String data = oldSensor.getOldData();

        System.out.println("This is the data from the old sensor: " + data);

        System.out.println("Let me transform it.");

        System.out.println("Some data from a old sensor transformed to the format of a new sensor via the adapter.");
    }
}
