package gqt375;
/**
 * @author tharun
 */
import java.util.Scanner;

public class Program107 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String first = sc.nextLine();
		System.out.print("Enter the second string: ");
		String second = sc.nextLine();
		String result = first + second;
		System.out.println("Concatenated string: " + result);
		}
}
