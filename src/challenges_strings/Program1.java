package challenges_strings;
// Program to reverse a String

import java.util.Scanner;

class Reverse{
	Scanner sc = new Scanner(System.in);
	String str;
	String rev = "";

	void sol() {
		System.out.println("Enter the String: ");
		str = sc.nextLine();

		for(int i=str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		//System.out.println("Reversed String is : "+rev);
	}

}
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse r = new Reverse();
		r.sol();

		System.out.println(r.rev);
	}

}
