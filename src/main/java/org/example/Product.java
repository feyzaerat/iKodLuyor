package org.example;

public class Product {
    public Product(){

    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private double price;

    //method

    public void discount(double discount){
        price = price - discount;
    }

    //method overloading

    public void discount(double discount, int percent){
        price = price - discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
