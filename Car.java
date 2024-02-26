package org.example;
import java.util.Calendar;

public  class Car extends Vehicle{
    public Car( String brand,int modelYear) { //Creates a Car object with given brand and model year
        super(brand, modelYear);
    }

    @Override
    public void move() { // Displays a message indicating that the car is moving.
        System.out.println("Car is moving");
    }
    public double fuelConsumption(int distance) {
        // Calculates the fuel consumption of the car for the given distance
        return distance * 0.15;
    }
    public int lossInValue() {
        //Calculates the loss in value of the car.
        int K = 1000; // it is a constant value for car.
        return (Calendar.getInstance().get(Calendar.YEAR) - getModelYear()) * K;
    }
}
