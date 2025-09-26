package challenges_array;
// Program to reverse an array
import java.util.Scanner;

class Reverse{
	Scanner sc = new Scanner (System.in);
	int arr[];
	int rev[];
	
	void data() {
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();
		
		arr = new int[n];
		rev = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}

		for(int i=0;i<arr.length;i++) {
			rev[i] = arr[n-1-i];
		}		
		
		System.out.println("----------------");
		System.out.println("Reversed Array is : ");

		for(int i=0;i<arr.length;i++) {
			System.out.println(rev[i]);
		}
	}
}

public class Program5 {

	public static void main(String[] args) {
		Reverse r = new Reverse();
		r.data();
		
	}

}
