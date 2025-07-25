package patterns;

import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the count:");
		int n=sc.nextInt();
		for(int i=1; i<=n;i++) {
			System.out.println("*");
		}
	}

}
