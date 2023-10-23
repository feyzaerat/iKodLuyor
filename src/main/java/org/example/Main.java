package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "Merhaba Tobeto";
        System.out.println(text);

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
    }
}