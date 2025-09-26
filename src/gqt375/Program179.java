package gqt375;
/**
 * @author tharun
 */
class Program179 {
    private int productId;
    private String productName;
    private double price;

    public Program179(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be greater than zero.");
        }
    }

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Program179 prod = new Program179(1, "Laptop", 800.0);
        prod.displayProduct();
        prod.setPrice(850.0);
        System.out.println("\nUpdated Product Details:");
        prod.displayProduct();
        prod.setPrice(-200);
    }
}
