import java.util.Scanner;

public class Methods {
    public static void getRequirements() {
        System.out.println("Author: Anthony Patregnani");
        System.out.println("Non-OOP program calulates diameter, circumference, and cirlce area.");
        System.out.println("Must use Java's built-in Pi Constant, printf(), and format to two decimal places.");
        System.out.println("Must *only* permit numeric entry");
    }
    public static void calculateCircle() {
        Scanner sc = new Scanner (System.in);
        double radius = 0.0;

        System.out.println("Enter circle radius: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Not a valid number!\n");
            sc.next();
            System.out.println("Please try again. Enter circle radius: ");
        }
        radius = sc.nextDouble();

        System.out.printf("\nCircle diameter: %.2f\nCircumference: " + "%.2f\nArea: %.2f\n", (2*radius), (2*Math.PI*radius), (Math.PI*radius*radius));

        sc.close();
    }
}

