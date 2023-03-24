package zzapr.zzapr.lesson5;

public class Car {

    private String manufacturer;

    private String type;

    private int pricePaid;

    private int odometer;


    public Car(String manufacturer, String type, int pricePaid, int odometer) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.pricePaid = pricePaid;
        this.odometer = odometer;


    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPricePaid() {
        return pricePaid;
    }

    public void setPricePaid(int pricePaid) {
        this.pricePaid = pricePaid;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public String toString() {
        String text ="";

        text += this.manufacturer + " " + this.type + ": " + this.pricePaid + " EUR, " + "mileage: "+ this.odometer + " km";

        return text;
    }
}
