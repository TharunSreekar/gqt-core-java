/**
 * 
 */
package gqt375;

import java.util.Scanner;

/**@author tharun
 * description : Write a program to check whether a given string is palindrome or not.?
 * 
 */
public class Program102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("The reversed String is "+rev);
		if(str.equals(rev) == true) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
