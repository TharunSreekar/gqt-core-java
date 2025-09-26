package gqt375;
/**
 * @author tharun
 */
import java.util.Scanner;
public class Program118 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();
		String[] words = sentence.trim().split("\\s+");
		StringBuilder capitalizedSentence = new StringBuilder();
		for (String word : words) {
			if (word.length() > 0) {
				capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
				.append(word.substring(1).toLowerCase())
				.append(" ");
			}
		}
		System.out.println("Capitalized sentence:");
		System.out.println(capitalizedSentence.toString().trim());
	}
}
