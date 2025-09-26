//package strings;
//
//public class MutableBuiltInethods2 {
//	public static void main(String[] args) {
//		StringBuffer str = new StringBuffer("Ramaayna");
//		//1. length() : It will provide the length of the String
//		int length = str.length();
//		System.out.println("The length of the string is : "+length);
//		System.out.println("----------");
//
//		//2. charAt() : It will provide the character at the specified position
//		char c = str.charAt(0);
//		System.out.println(c);
//
//		//c = str.charAt(100);
//		//System.out.println(c);
//		System.out.println("-----------");
//
//		//3. append() : It merges the content of the 2 Strings
//		StringBuffer str1 = new StringBuffer(" is the best player in the World.");
//		str.append(str1);
//		System.out.println(str1);
//		System.out.println("-----------");
//
//		//4.contains() : It will check if substring is present in the main String
//		boolean res1 = str.contains("Ramesh");
//		System.out.println(res1);
//		res1 = str.contains("Umesh");
//		System.out.println(res1);
//		System.out.println("-----------");
//
//		//5. endsWith() : It will check if substring is present at the end of the main String
////		boolean res2 = str.endsWith("kar");
////		System.out.println(res2);
////		res2 = str.endsWith("kaR");
////		System.out.println(res2);
////		System.out.println("-----------");
//
//		//6. startsWith() : It will check if substring is present at the start of the main String
////		boolean res3 = str.startsWith("Sachin");
////		System.out.println(res3);
////		res3 = str.startsWith("sachin");
////		System.out.println(res3);
////		System.out.println("-----------");
//
//		//7. getClass() : It will provide the root class path of the object
//		Class class1 = str.getClass();
//		System.out.println(class1);
//		System.out.println("-----------");
//
//		//8. hashCode() : It will return the hash value of the given object
//		int hash = str.hashCode();
//		System.out.println(hash);
//		System.out.println("-----------");
//
//		//9. indexOf() : It will provide the index of the specified character
//		int index1 = str.indexOf('r');
//		System.out.println(index1);
//		index1 = str.indexOf('z');
//		System.out.println(index1);
//		System.out.println("-----------");
//
//		//10. isBlank() : checks if the String is empty or has only spaces.
//		boolean res4 = str.isBlank();
//		System.out.println(res4);
//
//		String str2 = "      ";
//		res4 = str2.isBlank();
//		System.out.println(res4);
//
//		String str3 ="";
//		res4 = str3.isBlank();
//		System.out.println(res4);
//		System.out.println("----------");
//
//		//11. isEmpty() : CHecks if the String is empty
//		boolean res5 = str.isEmpty();
//		System.out.println(res5);
//
//		res5 = str2.isEmpty();
//		System.out.println(res5);
//
//		res5 = str3.isEmpty();
//		System.out.println(res5);
//		System.out.println("-----------");
//
//		//12. lastIndexOf : It will provide the last occurrence position of the specified character
//		int res6 = str.lastIndexOf('a');
//		System.out.println(res6);
//		res6 = str.lastIndexOf('o');
//		System.out.println(res6);
//		System.out.println("-----------");
//
//		//13. replace() : It will replace the old character with new character
//		String s1 = str.replace('S', '$');
//		System.out.println(s1);
//		System.out.println("-----------");
//
//		//14. substring() : It will provide the substring from the specified position
//		String substring = str.substring(6);
//		System.out.println(substring);
//
//		//15. substring(int start,int end)
//		substring = str.substring(6,12);//provide the substring from the specified position to the specified position
//		System.out.println(substring);
//
//		//16. toUpperCase()
//		String upperCase = str.toUpperCase();//it convert string to upper case
//		System.out.println(upperCase);
//
//		//17. toLowerCase()
//		String lowerCase = str.toLowerCase();//it convert string to upper case
//		System.out.println(lowerCase);
//	}
//}
