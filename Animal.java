package org.example;

public abstract class Animal implements Movable{
    private String name;
    private  double starvationState;

    public String getName() {
        return name;
    }

    public double getStarvationState() {
        return starvationState;
    }
    /**
     * Creates a new Animal object with the given name
     * Initializes the starvation state to 1.0 (fully hungry)
     * @param name the name of the animal
     */
    public Animal(String name){
        this.name= name;
        this.starvationState= 1.0;
    }
    /**
     * Sets the starvation state of the animal
     * The starvation state should be between 0.0 and 1.0
     * @param starvationState the starvation state of the animal
     */
    public  void setStarvationState(double starvationState){
        if ( starvationState <= 1.0 && starvationState >= 0.0){
            this.starvationState = starvationState;
        }
    }
    abstract void getNourish();

}
