package arrays;

import java.util.Scanner;

class ArrayOperations2{
	String arr[][];
	Scanner sc=new Scanner(System.in);
	void CreateArray() {
		System.out.println("Enter class count ");
		int cls= sc.nextInt();
		arr = new String[cls][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of students inside class no: "+(i+1));
			arr[i]= new String[sc.nextInt()];
		}
		System.out.println("Array created ");
		System.out.println("----------");
	}
	
	void CollectData() {
		for( int i=0; i<arr.length; i++) {
			System.out.println("Inside class no :"+(i+1));
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Enter the name of student no "+(j+1));
				arr[i][j]= sc.next();
				
			}
		}
		System.out.println("Data collected ");
		System.out.println("----------");
	}
	
	void DisplayData() {
		for(int i=0;i<arr.length; i++) {
			System.out.println("Inside class no: "+(i+1));
			for(int j=0; j<arr[i].length;j++) {
				System.out.println("The name of student no: "+(j+1)+ " is "+arr[i][j]);
			}
		}
	}	
}

public class Unequivallent_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations2 ao = new ArrayOperations2();
		ao.CreateArray();
		ao.CollectData();
		ao.DisplayData();
	}

}
