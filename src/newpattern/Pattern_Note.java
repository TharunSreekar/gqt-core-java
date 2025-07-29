/**
 * 
 */
package newpattern;

import java.util.Scanner;

/**@author tharu
 * @category
 * @description
 */
public class Pattern_Note {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		
		//Alphabet-T
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if( i==0 || j==n/2  ) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			//Alphabet-H
			for(int j=0; j<n; j++) {
				if( j==0 || j==n-1 || i==n/2  ) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			//Alphabet-A
			for(int j=0; j<n; j++) {
				if((j==0 && i>=n/2) || i+j==n/2 || j-i==n/2 || (j==n-1 && i>=n/2) || i==n/2) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			//Alphabet-N
			for(int j=0; j<n; j++) {
				if( j==0 || i==j || j==n-1  ) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			//Alphabet-K
			for(int j=0; j<n; j++) {
				if(  j==0 || i+j==n/2 || i-j==n/2 ) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
			//Alphabet Y
			for(int j=0; j<n; j++) {
				if( (i==j && i<=n/2) || (i+j==n-1 && i<=n/2) || (j==n/2 && i>=n/2) ) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			//Alphabet-O
			for(int j=0; j<n; j++) {
				if( i==0 || j==0 || i==n-1 || j==n-1 ) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			//Alphabet-U
			for(int j=0; j<n; j++) {
				if( j==0 || i==n-1 || j==n-1  ) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print("	");
			
			//Alphabet-G
			for(int j=0; j<n; j++) {
				if( i==0 || j==0 || i==n-1 || (i==n/2 && j>=n/2) || (j==n-1 && i>=n/2)  ) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			//Alphabet-U
			for(int j=0; j<n; j++) {
				if( j==0 || i==n-1 || j==n-1  ) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			//Alphabet-R
			for(int j=0; j<n; j++) {
				if( j==0 || i==0 || (i==n/2 && j>=n/2)  || (i==j && i>=n/2) || (j==n-1 && i<=n/2)  ) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			//Alphabet-U
			for(int j=0; j<n; j++) {
				if( j==0 || i==n-1 || j==n-1  ) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			//Alphabet-J
			for(int j=0; j<n; j++) {
				if( i==0 || j==n/2 || (i==n-1 && j<=n/2) ){
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			//Alphabet-I
			for(int j=0; j<n; j++) {
				if( i==0 || i==n-1 || j==n/2  ) {
					System.out.print("# ");
				}else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
		sc.close();
	}

}
