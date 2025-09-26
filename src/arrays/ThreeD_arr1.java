package arrays;

import java.util.Scanner;

class ArrayOpe1{
	String arr[][][];
	Scanner sc= new Scanner(System.in);
	
	void create() {
		System.out.println("Enter the School count: ");
		int sch= sc.nextInt();
		System.out.println("Enter the Class count: ");
		int cls= sc.nextInt();
		System.out.println("Enter the Student count: ");
		int stu= sc.nextInt();
		
		//3D Array
		arr= new String[sch][cls][stu];
		System.out.println("Array created");
		System.out.println("---------");
	}
	
	void collect() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school No: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no :"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter name of the student no :"+(k+1));
					arr[i][j][k]=sc.next();
				}
			}
		}
	}
	
	void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school No: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no :"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The name of the student no :"+(k+1)+" is "+arr[i][j][k]);
				}
			}
		}
	}
}

public class ThreeD_arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayOpe1 ao = new ArrayOpe1();
		ao.create();
		ao.collect();
		ao.display();
	}

}
