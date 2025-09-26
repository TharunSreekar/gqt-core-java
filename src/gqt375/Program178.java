package gqt375;
/**
 * @author tharun
 */
class Program010 {
    private int empId;
    private String name;
    private double salary;

    public Program010(int empId, String name, double salary) {
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
        this.salary = salary;
    }
}

public class Program178 {
    public static void main(String[] args) {
        Program010 emp = new Program010(102, "Bob", 55000.0);
        System.out.println("ID: " + emp.getEmpId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: $" + emp.getSalary());
        emp.setSalary(60000.0);
        System.out.println("Updated Salary: $" + emp.getSalary());
    }
}
