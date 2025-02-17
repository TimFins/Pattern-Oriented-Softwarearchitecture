package Adapter.SensorAdapter;

import java.util.ArrayList;
import java.util.List;

public class DataHandler {
    public List<Sensor> sensors;

    public DataHandler() {
        this.sensors = new ArrayList<Sensor>();
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    public void handle() {
        for (Sensor sensor : sensors) {
            sensor.getData();
        }
    }
}
