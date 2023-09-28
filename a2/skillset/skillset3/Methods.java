import java.util.Scanner;

class Methods {
    public static void getRequirements() {
        System.out.println("Author: Anthony Patregnani");
        System.out.println("Program counts, totals, and averages total number of user-entered exam scores.");
        System.out.println("Please enter exam scores between 0 and 100, inclusive. \nEnter out of range number to end program.");
        System.out.println("Must *only* permit numeric entry.");
    }
    public static void calculateScores() {
        Scanner sc = new Scanner (System.in);
        double total = 0.0;
        int count = 0;
        double score = 0.0;
        double average = 0.0;


        while (score >= 0 && score <= 100) {
            System.out.println("Enter exam score: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Not a valid number!\n");
                sc.next();
                System.out.println("Please try again. Enter exam score: ");
        }
        score = sc.nextDouble();

        if (score > 0 && score <= 100) {
            count = ++count;
            total = total + score;
        }
    }
    average = total / count;

    System.out.println("Count: " + count);
    System.out.println("Total: " + total);
    System.out.println("Average: " + average);

       sc.close();
    }
}
