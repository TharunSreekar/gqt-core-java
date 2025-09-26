package interfaceprogramming;

//try with multiple catch 

import java.util.InputMismatchException;
import java.util.Scanner;

public class Launch4 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Division Operation");
			System.out.println("Enter the first number : ");
			int n1 = sc.nextInt();//critical statement -- InputMismatchException
			System.out.println("Enter the second number : ");
			int n2 = sc.nextInt();//critical statement -- InputMismatchException

			int res = n1 / n2;//critical statement -- ArithmeticException

			System.out.println(res);
			System.out.println("-----------------");
			System.out.println("Array Operation");
			System.out.println("Enter the array size : ");
			int size = sc.nextInt();//critical statement -- InputMismatchException
			int arr[] = new int[size];//critical statement -- NegativeArraySizeException
			System.out.println("Enter the value to be added : ");
			int val = sc.nextInt();//critical statement -- InputMismatchException
			System.out.println("Enter the position into which value has to be added : ");
			int pos = sc.nextInt();//critical statement -- InputMismatchException
			arr[pos] = val;//critical statement -- ArrayIndexOutOfBoundsException
			System.out.println("value added");
			
			sc.close();
		}
		// specific catch
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception was generated and handled");
		}
		catch(InputMismatchException ime) {
			System.out.println("Input Mismatch Exception was generated and handled");
		}
		catch(NegativeArraySizeException nae) {
			System.out.println("Negative Array Size Exception was generated and handled");
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("Array Index Out Of Bounds Exception was generated and handled");
		}
		//generic catch
		catch (Exception e) {
			System.out.println("Exception Occured and handled in catch block.");
		}
	}
}