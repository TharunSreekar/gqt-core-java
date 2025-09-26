package encapsulation;
// Generic Setters and Getters
class Lion{
	private String name;
	private String color;
	private String country;
	private int age;
	
	void setData1() {
		name = "Kiran";
		color = "Yellow";
		country = "Africa";
		age = 9;
	}
	
	void setData2(String a,String b, String c, int d ) {
		name = a;
		color = b;
		country = c;
		age = d;
	}
	void getData() {
		System.out.println("Name = "+name);
		System.out.println("Color = "+color);
		System.out.println("Country = "+country);
		System.out.println("Age = " +age);
	}
}

public class Example1 {

	public static void main(String[] args) {
		Lion l = new Lion();
		
//		l.name = "Ramu";		// private members cannot be accessed outside the class
//		l.color = "White";		// private members cannot be accessed outside the class
//		l.country = "India";	// private members cannot be accessed outside the class
//		l.age = 9;				// private members cannot be accessed outside the class
		
		l.setData1();
		l.getData();
		System.out.println("--------------");
		l.setData2("Ramu", "White", "India", 14);
		l.getData();
	}

}
