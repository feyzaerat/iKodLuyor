package org.example;

public class Product {
    public Product(){
        System.out.println("Boş ctor çalıştırıldı..");
    }
    public Product(String name, double price){
        //System.out.println("Name parametresi ile çalıştırıldı..");
        this.name = name;
        this.price = price;
    }
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
