package gqt375;
/**
 * @author tharun
 */
public class Program182 {
	public static int sum(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println("Sum of array: " + sum(numbers));
	}
}