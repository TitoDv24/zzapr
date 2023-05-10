package zzapr.zzapr.lesson6;

public class Garage {
    final static int MAX_CARS_GARAGE = 100;

    private int carCounter = 0;

    Car[] cars = new Car[MAX_CARS_GARAGE]; //instance variable - association

    public void addCarToGarage(Car car) {
        if (carCounter < MAX_CARS_GARAGE && car != null) {
            cars[carCounter] = car;
            carCounter++;
        } else {
            System.out.println("Garage is full or" + "car is null !!!");
        }

    }

    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < carCounter; i++) {
            text += cars[i] + "\n";
        }

        return text;

    }

    public Car getMostExpensiveCar() {
        Car mostExpensive = null; //local variable - dependency
        if (0 < carCounter) {
            mostExpensive = cars[0];

            for (int i = 1; i < carCounter; i++) {
                if (mostExpensive.getPricePaid() < cars[i].getPricePaid()) {
                    mostExpensive = cars[i];
                }
            }
        }
        return mostExpensive;
    }

    public void orderByMileage() {
        for (int i = 0; i < carCounter - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < carCounter; j++) {
                if (cars[j].getOdometer() > cars[maxIndex].getOdometer()) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                Car temp = cars[i];
                cars[i] = cars[maxIndex];
                cars[maxIndex] = temp;
            }
        }
    }

}
