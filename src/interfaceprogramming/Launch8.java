package interfaceprogramming;
// rethrowing the exception 'throw' is the keyword
import java.util.Scanner;

class Operation12{
	void function1() throws Exception{
		System.out.println("Inside function 1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int n1 = sc.nextInt();	//critical statement -- InputMismatchException
		System.out.println("Enter the second number : ");
		int n2 = sc.nextInt();	//critical statement -- InputMismatchException
		int res = n1 / n2;	//critical statement -- ArithmeticException
		System.out.println(res);
		System.out.println("Outoff function 1");
	}
}
class Operation22{
	void function2() throws Exception{
		System.out.println("Inside function 2");
		Operation12 op12 = new Operation12();
		op12.function1();
		System.out.println("Outoff function 2");
	}
}

class Operation32{
	void function3() throws Exception{
		System.out.println("Inside function 3");
		Operation22 op22 = new Operation22();
		try {
			op22.function2();
		}
		catch(Exception e) {
			System.out.println("Exception handled in function 3");
			throw e;
		}
		System.out.println("Outoff function 3");
	}
}
public class Launch8 {
	public static void main(String[] args) {
		System.out.println("Inside main function");
		Operation32 op32 = new Operation32();
		try {
			op32.function3();
		} 
		catch (Exception e) {
			System.out.println("Exception handled in main");
		}
		System.out.println("Outoff main function");
	}
}