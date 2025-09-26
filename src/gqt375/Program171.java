package gqt375;
/**
 * @author tharun
 */
class Program171 {
    private String name;
    private int age;
    private double salary;

    public Program171(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        Program171 emp = new Program171("John Doe", 30, 50000.0);
        emp.displayDetails();
        emp.setSalary(55000.0);
        System.out.println("\nUpdated Employee Details:");
        emp.displayDetails();
        emp.setSalary(-2000.0);
    }
}

