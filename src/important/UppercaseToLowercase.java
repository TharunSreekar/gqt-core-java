package important;

import java.util.Scanner;

public class UppercaseToLowercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		String temp="";
		String te="";
		for(int i=0;i<str.length()-1;i++) {
			temp += str.charAt(i);
		}
		temp+=str.charAt(str.length()-1);
		System.out.println(temp);
	}

}