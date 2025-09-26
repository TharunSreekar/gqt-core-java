package threads;

import java.util.Scanner;

// multi threading using thread class

class Operation1 extends Thread{
	@Override
	public void run() {
		System.out.println("Addition Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number : ");
		int num2 = sc.nextInt();
		int res = num1 + num2;
		System.out.println("Result"+res);
		System.out.println("Addition Operation Completed");
	}
}
class Operation2 extends Thread{
	@Override
	public void run()  {
		System.out.println("Printing Operation Started");
		for(int i=1; i<=10; i++) {
			System.out.println("Happy 6 years to GQT");

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing Operation Completed");
	}
}
class Operation3 extends Thread{
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking Operation Started");
		System.out.println("Enter the Account Number :");
		int accno = sc.nextInt();
		System.out.println("Enter the Pin Number :");
		int pin= sc.nextInt();
		System.out.println("Data Entered");
		System.out.println("Banking Operation Completed");
	}
}
public class ThreadCode4 {
	public static void main(String[] args) {
		Operation1 op1 = new Operation1();
		Operation2 op2 = new Operation2();
		Operation3 op3 = new Operation3();
		
		op1.start();
		op2.start();
		op3.start();
	}
}
