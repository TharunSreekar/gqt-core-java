package gqt375;
/**
 * @author tharun
 */
class Program177 {
    private int empId;
    private String name;
    private double salary;

    public Program177(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
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

    public void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        Program177 emp = new Program177(101, "Alice", 60000.0);
        emp.displayEmployee();
        emp.setSalary(65000.0);
        System.out.println("\nUpdated Employee Details:");
        emp.displayEmployee();
        emp.setSalary(-2000.0);
    }
}
