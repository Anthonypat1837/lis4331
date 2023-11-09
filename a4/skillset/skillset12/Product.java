public class Product {
    private String code;
    private String description;
    private double price;

    // Constructors
    public Product() {
        code = "abc123";
        description = "My Widget";
        price = 49.9;
    }

    public Product(String code, String description, double price) {
        // Parameterized constructor
        this.code = code;
        this.description = description;
        this.price = price;
    }

    // Setter methods
    public void setCode(String code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter methods
    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    // Custom method to format price
    public String getFormattedPrice() {
        return String.format("$%.2f", price);
    }

    // Custom method to print product details
    public void print() {
        System.out.println("Product Code: " + getCode());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: " + getFormattedPrice());
    }
}