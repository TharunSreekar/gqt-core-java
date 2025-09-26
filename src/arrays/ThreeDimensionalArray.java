package arrays;
//Jagged array
import java.util.Scanner;
class ArrayOpe{
	String arr[][][];
	Scanner sc = new Scanner(System.in);

	void create() {
		System.out.println("Enter the school count: ");
		int sch = sc.nextInt();

		arr = new String[sch][][];

		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter class count in school : "+(i+1));
			arr[i]=new String[sc.nextInt()][];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside School No: "+(i+1));
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
			System.out.println("Inside School No: "+(i+1));
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
			System.out.println("Inside School No: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside Class No: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The name of student no "+(k+1)+" is "+arr[i][j][k]);
				}
			}
		}
	}
}

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOpe ao = new ArrayOpe();
		ao.create();
		ao.Collect();
		ao.display();
	}
}
