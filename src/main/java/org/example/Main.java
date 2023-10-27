package org.example;

import org.example.inheritance.Animal;
import org.example.inheritance.Bird;
import org.example.inheritance.Dog;
import org.example.inheritance.Fish;
import org.example.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "Merhaba Tobeto";
        System.out.println(text);
        System.out.println("_________________________________________________");
        //Integer number = 10;

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);


        String state = "A";
        switch(state){
            case "A":
                System.out.println("A durumu");
                break;
            case "B":
                System.out.println("B durumu");
                break;
            case "C":
                System.out.println("C durumu");
                break;
            default:
                System.out.println("Bilinmeyen durumlar");
        }

        System.out.println("_________________________________________________");
        /************** 25.10.2023  -   2. DERS *******************/

        //Primitive Types: Complex olmayan basit türler ( String, Char, Integer...)
        //Ram'in Stack ve Head bölümlerinden, Primitive tiplerin, Stack bölümünde direk değeri saklanır. A=10 gibi

        //Reference Types: @abc123 => heap @abc123={"Feyza", "Ferit"}
        //@abc123 stack'de tutulurken, indexleri heap'de tutulur.

        //names = @6acbcfc0 => STACK
        //@6acbcfc0={"Feyza", "Ferit","Seyda"} => HEAP

        int a =5;
        int b =a;
        b+=1;
        System.out.println(a);
        System.out.println(b);

        String[] names = {"Feyza", "Ferit","Seyda", "Nurhan", "Rahmi"};

        //Clone : Aynı değere sahip bir adres daha oluştur ve o adrese clonla
        String[] names2 =names.clone();
        //String[] names2 = Arrays.copyOf(names, names.length);

        System.out.println(names);
        System.out.println(names2);

        names2[0] = "Karanfil";

        System.out.println(names[0]);
        System.out.println(names2[0]);
        System.out.println("_________________________________________________");

        for (int i = 0; i < names2.length; i++){
            System.out.println(names2[i]);
        }
        System.out.println("_________________________________________________");
        //names2 içindeki her bir elemanı iterasyona uğrat ve her elemana name takma adını ver
        //foreach
        for(String name:names2){
            System.out.println(name);

        }

        System.out.println("_________________________________________________");

        //OOP

        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(50);


        // constructor => yapıcı method
        Product product2 = new Product("Mouse", 10);
        //product2.name    = "Mouse";
        //product2.price   = 10;
        product2.discount(5);

        //System.out.println(product.price);
        //System.out.println(product2.price);

        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println("_________________________________________________");

        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println("_________________________________________________");


        Category category  = new Category();
        Order order        = new Order();



        Bird bird = new Bird();
        Dog dog   = new Dog();
        Fish fish = new Fish();
        bird.breathe();
        dog.bark();
        fish.breathe();

        System.out.println("_________________________________________________");

        //Polymorphism

        Animal animal  = new Bird();
        Animal animal1 = new Dog();
        Animal animal2 = new Fish();

        //casting

        ((Bird)animal).fly();
        Bird bird1 = (Bird)animal;


    }
}