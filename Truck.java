package org.example;

import java.util.Calendar;

public class Truck extends HeavyVehicle{
    public Truck(String brand,int modelYear) {
        super(brand, modelYear);
    }

    @Override
    public void move() {
        System.out.println("Truck is moving");
    }
    /**
     * Calculates the loss in value of the truck based on its model year
     * @return the loss in value of the truck
     */
    public int lossInValue() {
        int K = 500;// it is a constant value for truck.
        return (Calendar.getInstance().get(Calendar.YEAR) - getModelYear()) * K;
    }
    public int getMaxTonnage(){//return the max tonnage for Truck .
        return 25;
    }
    public double fuelConsumption(int distance) {
        // Calculates the fuel consumption of the Truck for the given distance
        return distance * 2;
    }
}
