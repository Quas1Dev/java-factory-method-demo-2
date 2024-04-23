package com.mycompany.factorymethoddemo2.factory;

import com.mycompany.factorymethoddemo2.animal.Animal;

public abstract class AnimalFactory {
    
    public void createAndDisplayBehavior(String color){
        Animal animal;
        animal = this.createAnimal(color);
        animal.describeBehavior();
    }
    
    protected abstract Animal createAnimal(String color);
}
