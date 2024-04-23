package com.mycompany.factorymethoddemo2.animal;

public class Tiger implements Animal{

    public Tiger(String color) {
        System.out.println("\n");
        System.out.println("A " + color + " tiger is created!");
    }
    
    @Override
    public void describeBehavior() {
        System.out.println("It says: Halum!");
        System.out.println("It loves to roam in the jungle!");
    }
    
}
