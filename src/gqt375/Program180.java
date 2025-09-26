package gqt375;
/**
 * @author tharun
 */
class Program11 {
    private int productId;
    private String productName;
    private double price;

    public Program11(int productId, String productName, double price) {
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
        this.price = price;
    }
}

public class Program180 {
    public static void main(String[] args) {
        Program11 prod = new Program11(2, "Phone", 600.0);
        System.out.println("Product ID: " + prod.getProductId());
        System.out.println("Product Name: " + prod.getProductName());
        System.out.println("Price: $" + prod.getPrice());
        prod.setPrice(650.0);
        System.out.println("Updated Price: $" + prod.getPrice());
    }
}
