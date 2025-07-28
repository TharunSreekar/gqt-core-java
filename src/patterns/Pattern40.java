package patterns;
import java.util.Scanner;
public class Pattern40 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        for (int i = 1; i <= rows; i++) {
	            for (int s = 1; s <= rows - i; s++) {
	                System.out.print(" ");
	            }
	            for (char ch = 'a'; ch < 'a' + i; ch++) {
	                System.out.print(ch);
	            }
	            for (char ch = (char) ('a' + i - 2); ch >= 'a'; ch--) {
	                System.out.print(ch);
	            }
	            System.out.println();
	        }

	        sc.close();

		}

	
}
