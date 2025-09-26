package arrays;
import java.util.Scanner;

public class Unstructured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student count: ");
		int n= sc.nextInt();
		
		// Creating an array of n size
		int arr[]= new int[n];
		
		//Collecting and storing marks of n students 
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the marks of student No: "+(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println("-------------");
		
		//Displaying the marks stored inside the array
		for(int i=0; i<arr.length; i++) {
			System.out.println("The marks of student No "+(i+1)+ " is "+arr[i]);
		}
		sc.close();
	}

}
