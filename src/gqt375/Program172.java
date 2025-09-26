package gqt375;
/**
 * @author tharun
 */
class Program07 {
    private String name;
    private int age;
    private double salary;

    public Program07(String name, int age, double salary) {
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
        this.salary = salary;
    }
}

public class Program172 {
    public static void main(String[] args) {
        Program07 emp = new Program07("Alice", 28, 40000.0);
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: $" + emp.getSalary());
        emp.setSalary(45000.0);
        System.out.println("Updated Salary: $" + emp.getSalary());
    }
}
