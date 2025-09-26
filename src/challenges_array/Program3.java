package challenges_array;
// Program to copy elements from one array to another
import java.util.Scanner;

class Copy{
	Scanner sc = new Scanner (System.in);
	int arr[];
	int arr1[];

	void data() {
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();
		arr = new int[n];
		arr1 = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
	}
	void copy1() {
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
			System.out.println(arr1[i]);
		}
	}

}

public class Program3 {

	public static void main(String[] args) {
		Copy c = new Copy();
		c.data();
		c.copy1();
		
	}

}
