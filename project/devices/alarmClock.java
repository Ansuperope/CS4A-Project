package project.devices;

public class AlarmClock extends SmartDevice implements DeviceSound {

    @Override
    public void deviceName() {
        System.out.println("Alarm Clock");
    }
}
