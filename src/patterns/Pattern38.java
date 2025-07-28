package patterns;
import java.util.Scanner;
public class Pattern38 {

		 public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number of rows: ");
		        int rows = sc.nextInt();

		        for (int i = 1; i <= rows; i++) {
		            for (int s = 1; s <= rows - i; s++) {
		                System.out.print(" ");
		            }

		            for (int j = i - 1; j >= 0; j--) {
		                System.out.print(j);
		            }

		            for (int j = 1; j <= i - 1; j++) {
		                System.out.print(j);
		            }

		            System.out.println();
		        }

		        sc.close();
		    }

	
}
