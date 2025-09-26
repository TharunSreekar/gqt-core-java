package arrays;

import java.util.Scanner;
class Movieope{
	long arr[][][];
	long investment;
	long prev_profit;
	long sum_revenue;
	Scanner sc= new Scanner(System.in);
	
	void create() {
		System.out.println("Enter the Language count: ");
		int lan= sc.nextInt();
		System.out.println("Enter the Category count: ");
		int cat= sc.nextInt();
		System.out.println("Enter the Movie count: ");
		int mov= sc.nextInt();
		
		//3D Array
		arr= new long[lan][cat][mov];
		
		System.out.println("Array created");
		System.out.println("----- ----- -----");
		
		System.out.println("Enter the investment: ");
		investment= sc.nextLong();
		System.out.println("Enter the previous year profit: ");
		prev_profit = sc.nextLong();
		
		System.out.println("----- ----- -----");
	}
	
	void collect() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside language No: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside category no :"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter revenue of the movie no :"+(k+1));
					arr[i][j][k]=sc.nextLong();
					sum_revenue += arr[i][j][k];
				}
			}
		}
		System.out.println("Data collected and calculated");
	}
	
	void display() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside Language No: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside category no :"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The revenue of the movie no :"+(k+1)+" is "+arr[i][j][k]);
				}
			}
		}
		
		System.out.println("Total revenue is "+sum_revenue);
		
		long profit = sum_revenue - investment;
		long loss = investment - sum_revenue ;
		if(sum_revenue>investment) {
			System.out.println("Tharun is in profit of "+profit);
			if(profit>prev_profit) {
				System.out.println("Tharun has made more profit than previous year.");
			}
			else {
				System.out.println("Tharun has not made more profit than previous year.");
			}
		}
		else {
			System.out.println("Tharun incurred a loss of "+loss);
		}
	}
}

public class Movie_Revenue {

	public static void main(String[] args) {
		Movieope mo = new Movieope();
		mo.create();
		mo.collect();
		mo.display();
	}

}
