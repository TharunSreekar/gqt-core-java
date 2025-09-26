package gqt375;
/**@author tharun
 * 
 */
class Program175 {
    private String company;
    private String model;
    private double price;

    public Program175(String company, String model, double price) {
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
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be greater than zero.");
        }
    }

    public void displayInfo() {
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Program175 car = new Program175("Toyota", "Corolla", 20000.0);
        car.displayInfo();
        car.setPrice(22000.0);
        System.out.println("\nUpdated Car Info:");
        car.displayInfo();
        car.setPrice(-5000);
    }
}
