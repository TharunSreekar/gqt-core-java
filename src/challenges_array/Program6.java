package challenges_array;
// Program to sort all elements in an array in ascending and descending order
import java.util.Scanner;

class Sort{
	Scanner sc = new Scanner (System.in);
	int arr[];

	void data() {
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();
		arr = new int[n];

		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Array in Ascending order: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Array in Descending order: ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}

	}
}

public class Program6 {

	public static void main(String[] args) {
		Sort s = new Sort();
		s.data();

	}

}
