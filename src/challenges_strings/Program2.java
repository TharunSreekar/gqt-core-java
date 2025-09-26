package challenges_strings;
// Program to check the String is Palindrome or not

import java.util.Scanner;

class Reverse1{
	Scanner sc = new Scanner(System.in);
	String str;
	String rev = "";

	void sol() {
		System.out.println("Enter the String: ");
		str = sc.nextLine();

		for(int i=str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		System.out.println("Reversed String is : "+rev);
	}
	void checkPalindrome() {
		if(str.equals(rev)==true){
			System.out.println("String is Paliindrome.");
		}else {
			System.out.println("String is not a Palindrome");
		}
	}

}
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse1 r = new Reverse1();
		r.sol();
		r.checkPalindrome();
		//System.out.println(r.rev);
	}

}
