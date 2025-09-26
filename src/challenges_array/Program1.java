package challenges_array;
// Program to find the sum of all elements in an array
import java.util.Scanner;

class Sum{
	Scanner sc = new Scanner (System.in);
	int arr[];
	int sum=0;
	
	void add() {
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();
		arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sum = sum+arr[i];
		}
		System.out.println("Sum of all elements is: "+sum);
	}
}

public class Program1 {

	public static void main(String[] args) {
		Sum s = new Sum();
		s.add();
		
	}

}
