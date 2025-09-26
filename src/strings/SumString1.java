package strings;

import java.util.Scanner;

public class SumString1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		int sum = 0;

		for(int i=0; i<str.length(); i++) {
				sum += str.charAt(i);
		}
		System.out.println("Sum of the String is = "+sum);
	}
}