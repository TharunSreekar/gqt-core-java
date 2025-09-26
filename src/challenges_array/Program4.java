package challenges_array;
// Program to remove duplicate elements in an array
import java.util.Scanner;

class Dup{
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
		System.out.println("After sorting : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

		System.out.println("After removing duplicates: ");
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println(arr[n-1]);


	}
}

public class Program4 {

	public static void main(String[] args) {
		Dup d = new Dup();
		d.data();

	}

}
