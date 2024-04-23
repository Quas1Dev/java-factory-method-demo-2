package com.mycompany.factorymethoddemo2;

import com.mycompany.factorymethoddemo2.factory.TigerFactory;
import com.mycompany.factorymethoddemo2.factory.DogFactory;
import com.mycompany.factorymethoddemo2.factory.AnimalFactory;

public class ModifiedFactoryMethod {
    public static void main(String[] args) {
        System.out.println("A modified Factory Method demo");
        
        AnimalFactory factory = new DogFactory();
        factory.createAndDisplayBehavior("Orange");
        
        factory = new TigerFactory();
        factory.createAndDisplayBehavior("Yellow");
    }
}
