import java.util.Scanner;

public class Methods {
    public static void getRequirements() {
        System.out.println("Author: Anthony Patregnani");
        System.out.println("Program converts seconds to minutes, hours, days, weeks, and years (365 days)");
        System.out.println("Use an integer for seconds");
        System.out.println("Use printf() function to print");
        System.out.println("Create Java constants for SECS_IN_MINS, MINS_IN_HR, HRS_IN_DAY, DAYS_IN_WEEK, DAYS_IN_YEAR");


    }
    public static void convertTime() {
        int seconds = 0;
        double minutes = 0.0;
        double hours = 0.0;
        double days = 0.0;
        double weeks = 0.0;
        double years = 0.0;

        final double SECS_IN_MINS = 60;
        final double MINS_IN_HR = 60;
        final double HRS_IN_DAY = 24;
        final double DAYS_IN_WEEK = 7;
        final double DAYS_IN_YEAR = 365;

        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter number of seconds: ");
        while (!sc.hasNextInt()) {
            System.out.print("Not valid intger!\n");
            sc.next();
            System.out.print("Please enter number of seconds: ");
        }
        seconds = sc.nextInt();


        minutes = seconds / SECS_IN_MINS;
        hours = minutes / MINS_IN_HR;
        days = hours / HRS_IN_DAY;
        weeks = days / DAYS_IN_WEEK;
        years = days / DAYS_IN_YEAR;

        System.out.printf("%,d second(s) equals \n\n%,.2f minute(s)\n%,.3f hour(s)\n%,.4f day(s)\n%,.5f week(s)\n%,.6f year(s)\n", seconds, minutes, hours, days, weeks, years);


        sc.close();
    }
}
