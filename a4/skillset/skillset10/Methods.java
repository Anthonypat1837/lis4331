import java.util.Scanner;

public class Methods {

    public static void getRequirements() {
        System.out.println("Author: Anthony Patregnani");
        System.out.println("1. Prompt user to enter miles and miles per hour");
        System.out.println("2. Display approximate travel time in hours and minutes.");
        System.out.println("3. Accept decimal (floating point) entries.");
        System.out.println("4. Must ask user to continue (Y/N)");
        System.out.println("5. Must perform data validation. Only numbers, miles range >0 and <=3000, and mph >0 <=100");
        System.out.println("");



    }

    public static void TravelTime() {
        Scanner scanner = new Scanner(System.in);
        char userChoice;

        do {
            double miles = getValidDoubleInput(scanner, "\nEnter the distance in miles (1 - 3000): ", 1, 3000);
            System.out.println("");
            double mph = getValidDoubleInput(scanner, "\nEnter the speed in miles per hour (1 - 100): ", 1, 100);
            System.out.println("");


            double travelTimeInHours = calculateTravelTime(miles, mph);

            int hours = (int) travelTimeInHours;
            int minutes = (int) ((travelTimeInHours - hours) * 60);

            System.out.println("\nApproximate travel time: " + hours + " hours and " + minutes + " minutes.");
            System.out.println("");


            System.out.print("Do you want to continue (y/n)? ");
            userChoice = scanner.next().charAt(0);
        } while (userChoice == 'y' || userChoice == 'Y');
    }

    public static double getValidDoubleInput(Scanner scanner, String prompt, double minValue, double maxValue) {
        double input;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();
                if (input >= minValue && input <= maxValue) {
                    break;
                } else {
                    System.out.println("Input out of range. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); 
            }
        }
        return input;
    }

    public static double calculateTravelTime(double miles, double mph) {
        return miles / mph;
    }
}