package org.example.inheritance;

public class Dog extends Animal{

    public void bark(){

    }

    @Override
    public void makeSound() {
        System.out.println("bark bark");
    }
}
