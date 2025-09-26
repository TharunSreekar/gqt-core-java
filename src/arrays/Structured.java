package arrays;
import java.util.Scanner;

class ArrayOperations{
	int arr[];
	Scanner sc=new Scanner(System.in);
	
	void CreateArray() {
		System.out.println("Enter the Student count: ");
		int n=sc.nextInt();
		arr=new int[n];
		System.out.println("Array created ");
		System.out.println("------------");
	}
	
	void CollectData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the marks of Student No: "+(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println("Data has stored inside of an Array.");
	}
	
	void DisplayData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("The marks of Student No "+(i+1)+" is "+arr[i]);
		}
	}
}

public class Structured {
	public static void main(String[] args) {
		ArrayOperations ao = new ArrayOperations();
		ao.CreateArray();
		ao.CollectData();
		ao.DisplayData();
	}
}
