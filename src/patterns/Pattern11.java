package patterns;

import java.util.Scanner;
public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
