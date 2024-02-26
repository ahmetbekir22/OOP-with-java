package org.example;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {// Displays a message indicating that the dog is moving
        System.out.println("Dog is galloping");
    }

    @Override
    public void getNourish() {
       double updatedRate = getStarvationState() -0.4; //decrease the starvation of dog.

        if (updatedRate <=0.0){ // calculates Starvation State for animal.
            setStarvationState(0.0);
        } else if (updatedRate>=1.0){
            setStarvationState(1.0);
        }else {
            setStarvationState(updatedRate);
        }
    }
    }

