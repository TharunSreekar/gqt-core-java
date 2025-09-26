package gqt375;

import java.util.Scanner;

/**
 * @author tharun
 */
public class Program103 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		input = input.toLowerCase();
		int vowels = 0, consonants = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLetter(ch)) {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonants: " + consonants);
	}

}
