package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instantiate scanner and dice
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice();

        // Print welcome message
        System.out.println("Welcome to the Dice Roller!");
        System.out.print("Roll the dice? (y/n): ");

        boolean condition = true;
        boolean condition2 = true;
        String choice = null;
        while (condition) {
            if (condition2) {
            choice = sc.nextLine();
            }
            if (choice.charAt(0) == 'y' || choice.charAt(0) == 'Y') {

                // Roll and print results of dice
                dice.roll();
                dice.printRoll();

                do {
                    // Ask to roll again
                    System.out.print("Roll again? (y/n): ");
                    choice = sc.nextLine();
                    if (choice.charAt(0) == 'n' || choice.charAt(0) == 'N') {
                        condition = false;
                        break;
                    } else if (choice.charAt(0) == 'y' || choice.charAt(0) == 'Y') {condition2 = false; break;}
                    else {System.out.println("Incorrect choice.");}
                } while (true);
            } else if (choice.charAt(0) == 'n' || choice.charAt(0) == 'N') {
                break;
            } else {
                System.out.println("Incorrect choice."); // If wrong character is given
            }
        }


    }
}