/**
 * 
 */
package newpattern;

/**@author tharu
 * @category
 * @description
 */
import java.util.Scanner;
public class NewPattern2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n= sc.nextInt();
		
		for(int i=0; i<n;i++) {
			for(int j=0; j<n; j++) {
				if(j==0 || i==n-1 || i==j) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
