public class Book extends Product {
    private String author;

    // Constructors
    public Book() {
        super(); // Call the superclass constructor
        this.author = "DefaultAuthor";
    }

    public Book(String code, String description, double price, String author) {
        super(code, description, price); // Call the superclass constructor with arguments
        this.author = author;
    }

    // Setter method for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter method for author
    public String getAuthor() {
        return author;
    }

    // Override print method from Product class
    @Override
    public void print() {
        super.print(); // Call the superclass print method
        System.out.println("Author: " + getAuthor());
    }
}