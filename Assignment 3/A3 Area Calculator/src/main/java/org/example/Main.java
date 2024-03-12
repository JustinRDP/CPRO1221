package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Instantiate scanner
        Scanner sc = new Scanner(System.in);

        // Print welcome message
        System.out.println("Welcome to the Area Calculator!");

        int mode = 0;
        String choice = null;
        while (true) {
            System.out.print("Calculate area of a circle, square, or rectangle? (c/s/r): ");
            choice = sc.nextLine();
            switch (choice) {
                case "c":
                case "C": circle(); break;
                case "s":
                case "S": square(); break;
                case "r":
                case "R": rectangle(); break;
                default: ;
            }
            System.out.print("\nContinue? (y/n): ");
            choice = sc.nextLine();
            if (choice.charAt(0) == 'y' || choice.charAt(0) == 'Y') {

                ;

            } else if (choice.charAt(0) == 'n' || choice.charAt(0) == 'N') {
                break;

            } else {
                System.out.println("Incorrect choice."); // If wrong character is given
            }
        }


    }

    public static void circle() {
        System.out.print("\nEnter radius: ");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        double area = 3.14159 * Math.pow(Double.parseDouble(value), 2);
        System.out.println("area: " + area);
    }
    public static void square() {
        System.out.print("\nEnter width: ");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        double area = Math.pow(Double.parseDouble(value), 2);
        System.out.println("area: " + area);
    }
    public static void rectangle() {
        System.out.print("\nEnter width: ");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        System.out.print("Enter height: ");
        String value2 = scanner.nextLine();
        double area = Double.parseDouble(value) * Double.parseDouble(value2);
        System.out.println("area: " + area);
    }
}