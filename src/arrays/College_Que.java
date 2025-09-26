package arrays;

import java.util.Scanner;

class CollegeOpe{
	String arr[][][];
	long revenue;
	long total_revenue;
	Scanner sc = new Scanner(System.in);

	void create() {
		System.out.println("Enter the College count: ");
		int clg = sc.nextInt();

		arr = new String[clg][][];

		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter class count in College : "+(i+1));
			arr[i]=new String[sc.nextInt()][];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside College No: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter count of students inside class No: "+(j+1));
				arr[i][j]= new String[sc.nextInt()];
			}
		}
		System.out.println("Array Created");
		System.out.println("----------");
	}

	void Collect() {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside College No: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside Class No: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the student name "+(k+1));
					arr[i][j][k]= sc.next();
				}
			}
		}
		
	}
	
	void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside College No: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside Class No: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The name of student no "+(k+1)+" is "+arr[i][j][k]);
					if(i==0) {
						total_revenue+=2500000;
					}else if(i==1) {
						total_revenue+=350000;
					}else {
						total_revenue+=80000;
					}
				}
				
			}
			
		}
		System.out.println("---- ---- ---- ");
		System.out.println("Total revenue is "+total_revenue);
		System.out.println("---- ---- ---- ");
	}
}

public class College_Que {

	public static void main(String[] args) {
		CollegeOpe co = new CollegeOpe();
		co.create();
		co.Collect();
		co.display();
	}

}
