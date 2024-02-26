package org.example;

interface Movable{  void move();} //It implements the Movable interface and provides common attributes and methods for all classes.

public abstract class Vehicle implements Movable { //It implements the Movable interface and provides common attributes
    // and methods for all vehicle types.
    private int modelYear;
    private String brand;
    public int getModelYear() {
        return modelYear;
    }
    public String getBrand() {
        return brand;
    }
    /**

     Constructs a Vehicle object with the specified brand and model year.
     @param brand The brand of the vehicle.
     @param modelYear The model year of the vehicle.
     */


    public  Vehicle(String brand,int modelYear){
        this.modelYear = modelYear;
        this.brand = brand;
    }


}
