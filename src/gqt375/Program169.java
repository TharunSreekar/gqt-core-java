package gqt375;
/**
 * @author tharun
 */
class Program05 {
    private String title;
    private String author;
    private double price;

    public Program05(String title, String author, double price) {
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

public class Program169 {
    public static void main(String[] args) {
        Program05 book = new Program05("Java Basics", "John Smith", 49.99);
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: $" + book.getPrice());
        book.setPrice(59.99);
        System.out.println("Updated Price: $" + book.getPrice());
    }
}
