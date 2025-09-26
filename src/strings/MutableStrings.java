package strings;

import java.util.Scanner;

public class MutableStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb1 = new StringBuffer("Ramayana. ");
		StringBuffer sb2 = new StringBuffer("Is the best Mythological Story");
		sb1.append(sb2);
		System.out.println(sb1);
		
		StringBuilder sb3 = new StringBuilder("Mahabharatha");
		StringBuilder sb4 = new StringBuilder("Is the best Mythological History");
		sb3.append(sb4);
		System.out.println(sb3);
	}

}
