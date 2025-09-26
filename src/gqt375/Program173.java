package gqt375;
/**
 * @author tharun
 */
class Program173 {
    private String name;
    private int rollNumber;
    private double marks;

    public Program173(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Marks should be between 0 and 100.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Program173 student = new Program173("Bob", 101, 85.0);
        student.displayStudentDetails();
        student.setMarks(90.0);
        System.out.println("\nUpdated Student Details:");
        student.displayStudentDetails();
        student.setMarks(120.0);
    }
}
