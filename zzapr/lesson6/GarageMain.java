package zzapr.zzapr.lesson6;

public class GarageMain {


    public static void main(String[] args) {

        Car car01 = new Car("Fiat", "500", 10000, 105000);


        Car car02 = new Car("Skoda", "Fabia", 8000, 30895);

        Car car03 = new Car("Sandero", "Dacia", 9000, 89000);



        Garage garage01 = new Garage();

        garage01.addCarToGarage(car01);
        garage01.addCarToGarage(car02);
        garage01.addCarToGarage(car03);
        System.out.println(garage01);
        System.out.println("The most expensive car is: " + garage01.getMostExpensiveCar() + "\n");
        garage01.orderByMileage();
        System.out.println("The list of the cars in order of mileage is: \n" + garage01);

    }
}

