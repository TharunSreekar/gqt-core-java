package patterns;
import java.util.Scanner;
public class Pattern13 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			count=i;
			for(int j=1;j<=n;j++) {
				System.out.print(count+"	");
				count+=n;
			}
			
			System.out.println();
		}
	}
}
