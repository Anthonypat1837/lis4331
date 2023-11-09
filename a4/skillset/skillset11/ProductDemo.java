import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate product objects
        Product defaultProduct = new Product(); // Using no-par constructor
        Product userEnteredProduct = getUserEnteredProduct(scanner); // Using parameterized constructor

        // Print product details
        System.out.println("\nDefault Product Details:");
        defaultProduct.print();

        System.out.println("\nUser Entered Product Details:");
        userEnteredProduct.print();
    }

    public static Product getUserEnteredProduct(Scanner scanner) {
        // Prompt user for input
        System.out.print("\nEnter product code: ");
        String code = scanner.nextLine();

        System.out.print("Enter product description: ");
        String description = scanner.nextLine();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        // Consume newline character
        scanner.nextLine();

        // Create and return a new Product object
        return new Product(code, description, price);
    }
}