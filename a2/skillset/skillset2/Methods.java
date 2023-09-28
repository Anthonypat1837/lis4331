import java.util.Scanner;

class Methods {
    public static void getRequirements() {
        System.out.println("Author: Anthony Patregnani");
        System.out.println("Program determines if first number is multiple of second, prints results");
        System.out.println("Examples: 2, 4, 6, 8, are multiples of 2.");
        System.out.println("Must *only* permit integers");
    }
    public static void multipleNumber() {
        Scanner sc = new Scanner (System.in);
        int num1 = 0;
        int num2 = 0;
        int valid = 0;
        int product = 0;

        System.out.println("Enter first number: ");
        while (!sc.hasNextInt()) {
            System.out.println("Not an integer!\n");
            sc.next();
            System.out.println("Please try again. Enter first number: ");
        }
        num1 = sc.nextInt();

        int num2 = 0;

        System.out.println("Enter second number: ");
        while (!sc.hasNextInt()) {
            System.out.println("Not an integer!\n");
            sc.next();
            System.out.println("Please try again. Enter second number: ");
        }
        num2 = sc.nextInt();

        valid = num1 % num2;

       System.out.println();

       if (valid == 0) {
        product = num1 / num2;
        System.out.printf("%d is multiple of %d\n", num1, num2);
        System.out.printf("The product of %d and %d is %d", product, num2, num1);
       }
       else {
        System.out.printf("%d is not multiple of %d", num1, num2);
       }

       System.out.println();

       sc.close();
    }
}
