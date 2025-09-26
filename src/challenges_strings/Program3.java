package challenges_strings;
// Program to count vowels and consonants in a string

import java.util.Scanner;

class VowCon{
	Scanner sc = new Scanner(System.in);
	String str;
	int vow_count=0;
	int con_count=0;

	void count() {
		System.out.println("Enter a String: ");
		str = sc.nextLine();

		for(int i=0; i<str.length(); i++) {
			if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z')) {
				if(str.charAt(i)=='A' || str.charAt(i)=='a' || str.charAt(i)=='E' || str.charAt(i)=='e' || str.charAt(i)=='I' ||
						str.charAt(i)=='i' ||str.charAt(i)=='O' || str.charAt(i)=='o' || str.charAt(i)=='U' || str.charAt(i)=='u') {
					vow_count++;
				}else {
					con_count++;
				}
			}
		}
	}
}
public class Program3 {
	public static void main(String[] args) {
		VowCon vc = new VowCon();
		vc.count();
		System.out.println("Vowel Count = "+vc.vow_count);
		System.out.println("Consonant Count = "+vc.con_count);
	}
}
