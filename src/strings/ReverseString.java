package strings;

/**@author tharun
 * description : Write a program to reverse a string.
 * 
 */
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev +str.charAt(i);
		}
		System.out.println("The reversed String is : "+rev);
	}

}
