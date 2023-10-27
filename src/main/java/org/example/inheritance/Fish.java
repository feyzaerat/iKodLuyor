package org.example.inheritance;

public class Fish  extends Animal{
    public void swim(){

    }

    @Override
    public void makeSound() {

    }

    @Override
    public void breathe() {
        //this  => içinde bulunduğum class
        //super => kalıtım aldığım class'ı ifade eder.
        System.out.println("Fish can't breathe.");
        //super.breathe();
    }
}
