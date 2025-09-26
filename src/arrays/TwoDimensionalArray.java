package arrays;

import java.util.Scanner;

class ArrayOperations1{
	String arr[][];
	Scanner sc=new Scanner(System.in);
	
	void CreateArray() {
		System.out.println("Enter class count ");
		int cls= sc.nextInt();
		System.out.println("Enter Student count in each class ");
		int stu = sc.nextInt();
		arr= new String[cls][stu];
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

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations1 ao = new ArrayOperations1();
		ao.CreateArray();
		ao.CollectData();
		ao.DisplayData();
	}

}
