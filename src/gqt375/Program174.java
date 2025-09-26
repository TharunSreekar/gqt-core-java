package gqt375;
/**
 * @author tharun
 */
class Program08 {
    private String name;
    private int rollNumber;
    private double marks;

    public Program08(String name, int rollNumber, double marks) {
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
        this.marks = marks;
    }
}

public class Program174 {
    public static void main(String[] args) {
        Program08 student = new Program08("Alice", 100, 88.0);
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Marks: " + student.getMarks());
        student.setMarks(92.0);
        System.out.println("Updated Marks: " + student.getMarks());
    }
}

