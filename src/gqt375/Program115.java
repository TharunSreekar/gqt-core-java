package gqt375;

import java.util.Scanner;

/**
 * @author tharun
 */
public class Program115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();
		String[] words = sentence.trim().split("\\s+");
		System.out.println("Reversed sentence:");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i]);
			if (i != 0) {
				System.out.print(" ");
			}
		}
	}
}
