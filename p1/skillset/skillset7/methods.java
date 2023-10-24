import java.util.Scanner;

public class methods
{

    public static void getRequirements()
    {
        System.out.println("Developer: Anthony Patregnani");
        System.out.println("Use integer for inches (must validate integer input)");
        System.out.println("Use printf() function to print (format values per below output).");
        System.out.println("Create Java \"constraints\" for the following values:");
        System.out.println("\tINCHES_TO_CENTIMETER,\n\tINCHES_TO_METER,\n\tINCHES_TO_FOOT,\n\tINCHES_TO_YARD,\n\tFEET_TO_MILE");
        System.out.println();
    }

    public static void createArray()
    {
        int inches=0;
        double centimeters=0.0;
        double meters=0.0;
        double feet=0.0;
        double yards=0.0;
        double miles=0.0;
        
        final double INCHES_TO_CENTIMETER = 2.54;
        final double INCHES_TO_METER = 0.254;
        final double INCHES_TO_FOOT = 12;
        final double INCHES_TO_YARD = 36;
        final double FEET_TO_MILE = 5280;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number of inches: ");
        while (!input.hasNextInt())
            {
                System.out.println("Not valid Integer!\n");
                input.next();
                System.out.println("Please enter number of inches: ");
            }
        inches = input.nextInt();

        centimeters = inches * INCHES_TO_CENTIMETER;
        meters = inches * INCHES_TO_METER;
        feet = inches/INCHES_TO_FOOT;
        yards = inches/INCHES_TO_YARD;
        miles = feet/FEET_TO_MILE;

        System.out.printf("%,d inch(es) equals\n\n%,.6f centimeter(s)\n%,.6f meter(s)\n%,.6f feet\n%,.6f yard(s)\n%,.6f mile(s)\n", inches, centimeters, meters, feet, yards, miles);
    }
}