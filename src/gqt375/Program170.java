package gqt375;
/**
 * @author tharun
 */
class Program06 {
    private String title;
    private String author;
    private double price;

    public Program06(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class Program170 {
    public static void main(String[] args) {
        Program06 book = new Program06("Python Basics", "Alice Brown", 39.99);
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: $" + book.getPrice());
        book.setPrice(45.99);
        System.out.println("Updated Price: $" + book.getPrice());
    }
}

