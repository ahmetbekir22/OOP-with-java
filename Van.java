package org.example;

import java.util.Calendar;

public class Van extends HeavyVehicle {

    public Van(String brand,int modelYear) {
        super(brand, modelYear);
    }

    @Override
    public void move() {// Displays a message indicating that the Van is moving.
        System.out.println("Van is moving ");
    }
    public int getMaxTonnage(){//return the max tonnage for Van .
        return 5;
    }
    public int lossInValue() {////Calculates the loss in value of the car.
        int K = 100;// it is a constant value for van.
        return (Calendar.getInstance().get(Calendar.YEAR) - getModelYear()) * K;
    }
    public double fuelConsumption(int distance) {
        // // Calculates the fuel consumption of the Van for the given distance
        return distance * 2;
    }
}
