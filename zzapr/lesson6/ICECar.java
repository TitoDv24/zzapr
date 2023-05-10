package zzapr.zzapr.lesson6;

public class ICECar extends Car{
    private String engineDisplacement;

    public ICECar(String manufacturer, String type, int pricePaid, int odometer, String engineDisplacement) {
        super(manufacturer, type, pricePaid, odometer);
        this.engineDisplacement = engineDisplacement;
    }

        public String getEngineDisplacement() {
            return engineDisplacement;
        }

        public void setEngineDisplacement(String engineDisplacement) {
            this.engineDisplacement = engineDisplacement;
        }

        @Override
        public String toString() {
            String text = super.toString();
            text += ", engine displacement: " + this.engineDisplacement;
            return text;
        }
}
