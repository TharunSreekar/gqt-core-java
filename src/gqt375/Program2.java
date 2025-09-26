package gqt375;

/**@author tharu
 * description: .write a program to print the sum of all even numbers from 1 to 100?
 */
public class Program2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1 ; i <= 100 ; i++) {
			if (i % 2 == 0) {
				sum += i; 
			}
		}
		System.out.println("Sum of even numbers from 1 to 100 is:" + sum);

	}

}
