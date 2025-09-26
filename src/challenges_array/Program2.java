package challenges_array;
// Program to find largest and smallest element in an array

import java.util.Scanner;

class LargeSmall{
	Scanner sc = new Scanner(System.in);
	int arr[];
	
	void data() {
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();
		arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int large = arr[0];
		int small = arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
			else if(arr[i]>large) {
				large = arr[i];
			}
		}
		System.out.println("Smallest element is : "+small);
		System.out.println("Largest element is : "+large);

	}
}
public class Program2 {

	public static void main(String[] args) {
		LargeSmall ls = new LargeSmall();
		ls.data();
		
	}

}
