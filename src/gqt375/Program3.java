package gqt375;

/**@author tharun
 * description : write a program to swap two numbers without using a temporary variable?
 * 
 */
public class Program3 {

	public static void main(String[] args) {
		int a = 5 ;
		int b = 10 ;
		System.out.println("Before swap:");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swap:");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b); 
	}

}
