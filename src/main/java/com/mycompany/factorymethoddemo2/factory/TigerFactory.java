package com.mycompany.factorymethoddemo2.factory;

import com.mycompany.factorymethoddemo2.animal.Animal;
import com.mycompany.factorymethoddemo2.animal.Tiger;

public class TigerFactory extends AnimalFactory {

    @Override
    protected Animal createAnimal(String color) {
        return new Tiger(color);
    }
    
}
