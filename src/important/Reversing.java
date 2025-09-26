package important;

import java.util.Scanner;

public class Reversing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter the String : ");
		str = sc.nextLine();
		
		int space_count =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				space_count++;
			}
		}
		int word_count = space_count+1;
		String arr[] = new String[word_count];
		
		int temp = arr.length-1;
		String temp_str ="";
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)!=' ') {
				temp_str+=str.charAt(i);
			}
			else {
				arr[temp]=temp_str;
				temp--;
				temp_str="";
			}
		}
		arr[temp]=temp_str;
		for(int i=0; i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
