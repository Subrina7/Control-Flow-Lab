package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Weatherwardrobe {
    public static void main(String[] args) {

        System.out.println("What's the weather like today? (rainy/ cloudy/ sunny/ snowy)");
        Scanner reader = new Scanner(System.in);
        String weather = reader.nextLine();

        System.out.println("What's the temperature today?");
        int temperature = reader.nextInt();
        if(temperature < 10) {
            System.out.println("You need layers!");
        }
            if(weather.equals("rainy")){
                if(temperature < 12)
                System.out.println("Wear a waterproof winter coat");
            } else { System.out.println("Bring a waterproof jacket or umbrella.");
            }

            if(weather.equals("sunny")) {
                if(temperature > 15)
                System.out.println("Grab your sunglasses, you can wear a lighter jacket");
            } else {
                System.out.println("Wear light clothes, you can layer too but don't forget spf");
            }



    }
}

