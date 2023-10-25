package org.example;

public class Product {
    public String name;
    public double price;

    //method

    public void discount(double discount){
        price = price - discount;
    }

    //method overloading

    public void discount(double discount, int percent){
        price = price - discount;
    }

}
