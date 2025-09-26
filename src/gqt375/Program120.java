package gqt375;
/**
 * @author tharun
 */
import java.util.Scanner;
public class Program120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the main string: ");
		String mainString = sc.nextLine();
		System.out.print("Enter the substring to search: ");
		String subString = sc.nextLine();
		if (mainString.contains(subString)) {
			System.out.println("\"" + subString + "\" is a substring of \"" + mainString + "\".");
		} else {
			System.out.println("\"" + subString + "\" is NOT a substring of \"" + mainString + "\".");
		}
	}
}
