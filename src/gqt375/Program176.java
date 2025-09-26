package gqt375;
/**
 * @author tharun
 */
class Program09 {
    private String company;
    private String model;
    private double price;

    public Program09(String company, String model, double price) {
        this.company = company;
        this.model = model;
        this.price = price;
    }

    public String getCompany() {
        return company;
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

public class Program176 {
    public static void main(String[] args) {
        Program09 car = new Program09("Honda", "Civic", 25000.0);
        System.out.println("Company: " + car.getCompany());
        System.out.println("Model: " + car.getModel());
        System.out.println("Price: $" + car.getPrice());
        car.setPrice(27000.0);
        System.out.println("Updated Price: $" + car.getPrice());
    }
}
