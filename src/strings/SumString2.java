package strings;

import java.util.Scanner;

public class SumString2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		int sum_upper = 0;
		int sum_lower = 0;
		int product = 1;

		for(int i=0; i<str.length(); i++) {
			if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z'))  {
				if(str.charAt(i) == 'A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
					sum_upper += str.charAt(i);
		}
				else if(str.charAt(i) == 'a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
					sum_lower += str.charAt(i);
				}
				else if(str.charAt(i) != 'A' || str.charAt(i)!='E' || str.charAt(i)!='I' || str.charAt(i)!='O' || str.charAt(i)!='U'
						|| str.charAt(i) != 'a' || str.charAt(i)!='e' || str.charAt(i)!='i' || str.charAt(i)!='o' || str.charAt(i)!='u') {
					product = product * str.charAt(i);
				}
			}
		}
		System.out.println("Sum of the Upper case is = "+sum_upper);
		System.out.println("Sum of the lower case is = "+sum_lower);
		System.out.println("Product of the Consonents is = "+product);
	}
}
