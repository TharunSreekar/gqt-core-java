package patterns;

import java.util.Scanner;

public class Pattern28 {

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
			for(int j=1;j<=(i*2)-1;j++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}

}
