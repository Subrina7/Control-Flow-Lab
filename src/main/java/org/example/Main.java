package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("What's your guess of the secret number?");
        Scanner reader = new Scanner(System.in);
        int secretnumber = reader.nextInt();

        if (secretnumber < 7){
            System.out.println("Too low!");
        } else if (secretnumber > 7) {
            System.out.print("Too high");
        } else {
            System.out.println("Yay!");
        }

    }
}