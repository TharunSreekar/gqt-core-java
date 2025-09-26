package strings;

import java.util.Scanner;

public class VowelCapsCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();

		int vow_low_count = 0;
		int vow_up_count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z')) {
				if(str.charAt(i) == 'A' || str.charAt(i)=='E' || str.charAt(i)=='I' ||
						str.charAt(i)=='O' || str.charAt(i)=='U') {
					vow_up_count++;
				}
				else if(str.charAt(i) == 'a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
					vow_low_count++;
				}
			}
		}
		System.out.println("Vowel Capital letter count = "+vow_up_count);
		System.out.println("Vowel Small letter count = "+vow_low_count);
	}

}
