package gqt375;
/**
 * @author tharun
 */
class Program03 {
    private String brand;
    private String model;
    private double price;

    public Program03(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class Program166 {
    public static void main(String[] args) {
        Program03 phone = new Program03("Samsung", "Galaxy S21", 800.0);
        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Price: $" + phone.getPrice());
        phone.setPrice(750.0);
        System.out.println("New Price: $" + phone.getPrice());
    }
}
