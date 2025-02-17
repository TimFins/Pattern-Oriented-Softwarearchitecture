package Adapter.SensorAdapter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataHandler dataHandler = new DataHandler();
        dataHandler.addSensor(new NewSensor(1));
        dataHandler.addSensor(new OldSensorAdapter(1, new OldSensor(2)));

        dataHandler.handle();
    }
}
