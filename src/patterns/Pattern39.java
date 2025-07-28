package patterns;

import java.util.Scanner;
public class Pattern39 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter number of rows: ");
			int rows=sc.nextInt();
	        for (int i = 1; i <= rows; i++) {
	            // Print leading spaces
	            for (int s = 1; s <= rows - i; s++) {
	                System.out.print(" ");
	            }

	            // Print ascending numbers from 1 to i
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }

	            // Print descending numbers from i-1 to 1
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print(j);
	            }

	            System.out.println(); // Next line
	        }
	        sc.close();

		}

	
}
