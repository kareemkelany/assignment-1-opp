/**
 * Stores a product's identifying details, price, stock, brand, and rating and
 * can display key product information.
 */
public class Product {

    private int productId;
    private String productName;
    private String category;
    private double price;
    private int stockQuantity;
    private String brand;
    private double rating;

    /** Creates a product with default field values. */
    public Product() {
    }

    /** Creates a product and initializes all product details. */
    public Product(int productId, String productName, String category,
                double price, int stockQuantity,
                String brand, double rating) {

        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.brand = brand;
        this.rating = rating;
    }

    /** Returns this product's identifier. */
    public int getProductId() {
        return productId;
    }

    /** Updates this product's identifier. */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /** Returns this product's name. */
    public String getProductName() {
        return productName;
    }

    /** Updates this product's name. */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /** Returns the category this product belongs to. */
    public String getCategory() {
        return category;
    }

    /** Updates the category this product belongs to. */
    public void setCategory(String category) {
        this.category = category;
    }

    /** Returns this product's unit price. */
    public double getPrice() {
        return price;
    }

    /** Updates this product's unit price. */
    public void setPrice(double price) {
        this.price = price;
    }

    /** Returns the number of units currently in stock. */
    public int getStockQuantity() {
        return stockQuantity;
    }

    /** Updates the number of units currently in stock. */
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    /** Returns the brand of this product. */
    public String getBrand() {
        return brand;
    }

    /** Updates the brand of this product. */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /** Returns this product's rating. */
    public double getRating() {
        return rating;
    }

    /** Updates this product's rating. */
    public void setRating(double rating) {
        this.rating = rating;
    }

    /** Prints this product's name, price, and available stock. */
    public void displayProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Price: RM" + price);
        System.out.println("Stock: " + stockQuantity);
    }
}