package com.mycompany.factorymethoddemo2.factory;

import com.mycompany.factorymethoddemo2.animal.Animal;
import com.mycompany.factorymethoddemo2.animal.Dog;

public class DogFactory extends AnimalFactory{

    @Override
    protected Animal createAnimal(String color) {
        return new Dog(color);
    }
    
}
