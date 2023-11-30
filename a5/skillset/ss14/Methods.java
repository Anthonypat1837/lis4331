import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Methods {
    static final Scanner sc = new Scanner(System.in);

    public static void getRequirements() {
        System.out.println("Author: Anthony Patregnani");
        System.out.println("Program performs the following functions:");
        System.out.println("1. Calculates amount of money saved for a period of years, at a specified interest rate.");
        System.out.println("2. Returned amount is formatted in U.S. currency, and round to two decimal places.");
    }

    public static double getPrincipal() {
        double principal = 0.0;

        System.out.println("\nCurrent principal: $");
        while (!sc.hasNextDouble()) {
            System.out.println("Not valid number\n");
            sc.next();
            System.out.print("Please try again. Enter principal: $");
        }
        principal = sc.nextDouble();

        return principal;
    }

    public static double getRate() {
        double rate = 0.0;

        System.out.println("\nInterest Rate per year: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Not valid number\n");
            sc.next();
            System.out.print("Please try again. Enter interest rate: ");
        }
        rate = sc.nextDouble();
        rate = rate / 100;

        return rate;
    }

    public static int getTime() {
        int time = 0;

        System.out.println("\nTotal time (in years): ");
        while (!sc.hasNextInt()) {
            System.out.println("Not an integer");
            sc.next();
            System.out.print("Please try again. Enter years: ");
        }
        time = sc.nextInt();

        return time;
    }

    public static void calculateInterest(double principal, double rate, int time) {
        double amount = 0.0;

        amount = principal * (1 + rate * time);
        rate = rate * 100;

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("\nYou will have saved " + nf.format(amount) + " in " + time + " years, at an interest rate of  " + rate + "%");
    }
}
