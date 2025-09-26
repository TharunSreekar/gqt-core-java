package arrays;

import java.util.Scanner;

class add1{
	int arr[];
	int sum;
	Scanner sc = new Scanner(System.in);
	
	void create() {
		System.out.println("Enter the array size: ");
		int n= sc.nextInt();
		
		arr= new int[n];

		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the values for array :");
			arr[i] = sc.nextInt();
			
		}
		System.out.println("----- ----- ----- ");
	}
	void display() {
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of all elements inside an array is "+sum);
	}
}
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add1 a =new add1();
		a.create();
		a.display();
	}

}
