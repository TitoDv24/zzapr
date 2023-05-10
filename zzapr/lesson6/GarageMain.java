package zzapr.zzapr.lesson6;

public class GarageMain {

    public static void main(String[] args) {

        BEVCar bevCar01 = new BEVCar("Tesla", "Model S", 80000, 30000, 80);
        BEVCar bevCar02 = new BEVCar("Nissan", "Leaf", 35000, 10000, 40);
        BEVCar bevCar03 = new BEVCar("BMW", "i3", 50000, 15000, 50);

        HEVcar hevCar01 = new HEVcar("Toyota", "Prius", 25000, 8000, 4.5);
        HEVcar hevCar02 = new HEVcar("Honda", "Insight", 28000, 12000, 4.0);
        HEVcar hevCar03 = new HEVcar("Ford", "Fusion", 30000, 15000, 5.0);

        ICECar iceCar01 = new ICECar("Volkswagen", "Golf", 20000, 10000, "gasoline");
        ICECar iceCar02 = new ICECar("Ford", "Mustang", 40000, 2000, "diesel");
        ICECar iceCar03 = new ICECar("Chevrolet", "Camaro", 50000, 5000, "gasoline");

        Garage garage01 = new Garage();

        garage01.addCarToGarage(bevCar01);
        garage01.addCarToGarage(bevCar02);
        garage01.addCarToGarage(bevCar03);
        garage01.addCarToGarage(hevCar01);
        garage01.addCarToGarage(hevCar02);
        garage01.addCarToGarage(hevCar03);
        garage01.addCarToGarage(iceCar01);
        garage01.addCarToGarage(iceCar02);
        garage01.addCarToGarage(iceCar03);

        System.out.println(garage01);
        System.out.println("The most expensive car is: " + garage01.getMostExpensiveCar() + "\n");
        garage01.orderByMileage();
        System.out.println("The list of the cars in order of mileage is: \n" + garage01);

    }
};
