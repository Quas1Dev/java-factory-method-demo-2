package com.mycompany.factorymethoddemo2.animal;

public class Dog implements Animal{
    public Dog(String color){
        System.out.println("\n");
        System.out.println("A " + color + " dog is created!");
    }
    
    @Override
    public void describeBehavior() {
        System.out.println("It says: Bow-wow");
        System.out.println("It prefers barking!");
    }
    
}
