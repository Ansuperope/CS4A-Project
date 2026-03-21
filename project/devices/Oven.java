package project.devices;

public class Oven extends SmartDevice implements DeviceSound {

    @Override
    public void deviceName() {
        System.out.println("Oven");
    }
}
