package zzapr.zzapr.lesson6;

public class BEVCar extends Car {
    private int batteryCapacity;

    public BEVCar(String manufacturer, String type, int pricePaid, int odometer, int batteryCapacity) {
        super(manufacturer, type, pricePaid, odometer);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        String text = super.toString();
        text += ", battery capacity: " + this.batteryCapacity + " kWh";
        return text;
    }
}