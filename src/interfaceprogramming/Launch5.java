package interfaceprogramming;

//try with multi - catch

import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Launch5 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Division Operation");
			System.out.println("Enter the first number : ");
			int n1 = sc.nextInt();	//critical statement -- InputMismatchException
			System.out.println("Enter the second number : ");
			int n2 = sc.nextInt();	//critical statement -- InputMismatchException

			int res = n1 / n2;	//critical statement -- ArithmeticException

			System.out.println(res);
			System.out.println("-----------------");
			System.out.println("Array Operation");
			System.out.println("Enter the array size : ");
			int size = sc.nextInt();	//critical statement -- InputMismatchException
			int arr[] = new int[size];	//critical statement -- NegativeArraySizeException
			System.out.println("Enter the value to be added : ");
			int val = sc.nextInt();	//critical statement -- InputMismatchException
			System.out.println("Enter the position into which value has to be added : ");
			int pos = sc.nextInt();	//critical statement -- InputMismatchException
			arr[pos] = val;	//critical statement -- ArrayIndexOutOfBoundsException
			System.out.println("value added");
			
			sc.close();
		}
		// specific multi - catch
		catch(ArithmeticException | InputMismatchException e1) {
			System.out.println("Arithmetic Exception was generated and handled or"+
							"Input Mismatch Exception was generated and handled");
		}
		
		catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException ae) {
			System.out.println("Negative Array Size Exception was generated and handled"+
							"Array Index Out Of Bounds Exception was generated and handled");
		}
		
		//Generic catch
		catch (Exception e) {
			System.out.println("Exception Occured and handled in catch block.");
		}
	}
}