package gqt375;
/**
 * @author tharun
 */
public class Program202 {
	public static int fibonacci(int n) {
		if (n <= 1) return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	public static void main(String[] args) {
		int numTerms = 10;
		System.out.println("Fibonacci Series:");
		for (int i = 0; i < numTerms; i++) {
			System.out.print(fibonacci(i) + " ");
		}
		System.out.println();
	}
}
