package patterns;

import java.util.Scanner;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int a=1;
			for(int k=n;k>=i;k--) {
				System.out.print("  ");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print(a+" ");
				a++;
			}
			for(int l=1;l<=i;l++) {
				System.out.print(a+" ");
				a--;
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++) {
			int a=1;
			for(int k=1;k<=i;k++) {
				System.out.print("  ");
			}
			for(int j=n;j>=i+1;j--) {
				System.out.print(a+" ");
				a++;
			}
			for(int l=n;l>=i;l--) {
				System.out.print(a+" ");
				a--;
			}
			System.out.println();
		}
		sc.close();
	}

}
