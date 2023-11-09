import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate product objects
        Product defaultProduct = new Product(); // Using no-par constructor

        // Instantiate book objects
        Book defaultBook = new Book(); // Using no-par constructor
        Book userEnteredBook = getUserEnteredBook(scanner); // Using parameterized constructor

        // Print product and book details
        System.out.println("\nDefault Product Details:");
        defaultProduct.print();

        System.out.println("\nDefault Book Details:");
        defaultBook.print();

        System.out.println("\nUser Entered Book Details:");
        userEnteredBook.print();
    }

    public static Book getUserEnteredBook(Scanner scanner) {
        // Prompt user for input
        
        System.out.println("Author: Anthony Patregnani");
        System.out.println("\nPlease enter product details below:");


        System.out.print("\nEnter product code: ");
        String code = scanner.nextLine();

        System.out.print("Enter product description: ");
        String description = scanner.nextLine();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        scanner.nextLine(); // Consume newline character

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        // Create and return a new Book object
        return new Book(code, description, price, author);
    }
}