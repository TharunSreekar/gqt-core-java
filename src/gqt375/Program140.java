package gqt375;
/**
 * @author tharun
 */
import java.util.Scanner;
public class Program140 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in Celsius: ");
		double celsius = sc.nextDouble();
		double fahrenheit = (celsius * 9 / 5) + 32;
		System.out.printf("%.2f Celsius = %.2f Fahrenheit\n", celsius, fahrenheit);
	}
}