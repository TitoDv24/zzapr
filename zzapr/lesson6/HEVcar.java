package zzapr.zzapr.lesson6;

public class HEVcar extends Car {
    private double batteryCapacity;


    public HEVcar(String manufacturer, String type, int pricePaid, int odometer, double batteryCapacity) {
        super(manufacturer, type, pricePaid, odometer);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }



    @Override
    public String toString() {
        String text = super.toString();
        text += ", Battery Capacity: " + this.batteryCapacity + " kWh";
        return text;
    }
}
