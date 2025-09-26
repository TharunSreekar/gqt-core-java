package arrays;

import java.util.Scanner;

class Array2dmul{
	int arr[][];
	int arr1[][];
	int res[][];
	Scanner sc=new Scanner(System.in);
	void creatarray() {
		System.out.println("Enter the  row 1 count:");
		int r1=sc.nextInt();
		System.out.println("Enter the  col 1 count:");
		int c1=sc.nextInt();
		arr=new int[r1][c1];
		System.out.println("Array1 created");
		System.out.println(" -------------------");
		System.out.println("Enter the  row 2 count:");
		int r2=sc.nextInt();
		System.out.println("Enter the  col 2 count:");
		int c2=sc.nextInt();
		arr1=new int[r2][c2];
		res=new int[r1][c2];
		System.out.println("Array2 created");
		System.out.println(" -------------------");
	}
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside row no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("col: "+(j+1));
				arr[i][j]=sc.nextInt();
				System.out.println(" -------------------");
			}
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.println("Inside row no:"+(i+1));
			for(int j=0;j<arr1[i].length;j++) {
				System.out.println("col :"+(j+1));
				arr1[i][j]=sc.nextInt();
				System.out.println(" -------------------");
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				
				for(int k=0;k<arr[0].length;k++) {
					res[i][j]=res[i][j]+(arr[i][k]*arr1[k][j]);
				}
			}
		}
		System.out.println("Data collected");
	}
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class MatrixMultiplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2dmul A1=new Array2dmul();
		A1.creatarray();
		A1.collectData();
		A1.displayData();
	}
}
