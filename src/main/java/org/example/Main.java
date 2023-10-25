package org.example;

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
        product.name    = "Laptop";
        product.price   = 50;


        Product product2 = new Product();
        product2.name    = "Mouse";
        product2.price   = 10;




    }
}