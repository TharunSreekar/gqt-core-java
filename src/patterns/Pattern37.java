package patterns;
import java.util.Scanner;
public class Pattern37 {
	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        for (int i = 1; i <= rows; i++) {
	            // Print leading spaces
	            for (int s = 1; s <= rows - i; s++) {
	                System.out.print(" ");
	            }

	            // Starting character for this row
	            char start = (char) ('a' + i - 1);

	            // Descending from start to 'a'
	            for (char ch = start; ch >= 'a'; ch--) {
	                System.out.print(ch);
	            }

	            // Ascending from 'b' to start
	            for (char ch = 'b'; ch <= start; ch++) {
	                System.out.print(ch);
	            }

	            System.out.println();
	        }

	        sc.close();

		}

	
}
