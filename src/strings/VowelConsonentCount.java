package strings;

import java.util.Scanner;

public class VowelConsonentCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		str = str.toUpperCase();
		int vow_count = 0;
		int con_count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				if(str.charAt(i) == 'A' || str.charAt(i)=='E' || str.charAt(i)=='I' ||
						str.charAt(i)=='O' || str.charAt(i)=='U') {
					vow_count++;
				}
				else {
					con_count++;
				}
			}
		}
		System.out.println("Vowel count = "+vow_count);
		System.out.println("Consonent count = "+con_count);
	}

}
