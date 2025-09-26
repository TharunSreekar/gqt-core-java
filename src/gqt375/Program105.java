package gqt375;

import java.util.Scanner;

/**
 * @author tharun
 */
public class Program105 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		String noSpaces = input.replaceAll("\\s+", "");
		System.out.println("String after removing white spaces: " + noSpaces);
		}
}
