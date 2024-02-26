package org.example;

public class Fish extends  Animal{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {// Displays a message indicating that the fish is moving
        System.out.println("Fish is swimming");
    }

    @Override
    public void getNourish() {////decrease the starvation of fish
        double updatedRate= getStarvationState() -0.1;
        if (updatedRate <=0.0){
            setStarvationState(0.0);
        } else if (updatedRate>=1.0){
            setStarvationState(1.0);
        }else {
            setStarvationState(updatedRate);
        }
    }
}
