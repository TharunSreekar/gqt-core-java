package encapsulation;

class Dog00{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	// Zero parameterized constructor
	public Dog00() {
		super();
		System.out.println("Inside the zero parameterized constructor");
		
		this.name = "Ramu";
		this.color = "Brown";
		this.cost = 7000;
		this.age = 3;
		this.breed = "Pomorian";
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		
		System.out.println("-----------------");
	}
	
	// One parameterized constructor
	public Dog00(String name) {
		this();
		System.out.println("Inside One parameterized constructor");
		
		this.name = name;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		
		System.out.println("-----------------");
	}
	
	// Two parameterized constructor
	public Dog00(String name, String color) {
		this("Chimtu");
		System.out.println("Inside Two parameterized constructor");

		this.name = name;
		this.color = color;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		
		System.out.println("-----------------");
	}
	
	// Three parameterized constructor
	public Dog00(String name, String color, int cost) {
		this("Tommy", "Blue");
		System.out.println("Inside Three parameterized constructor");

		this.name = name;
		this.color = color;
		this.cost = cost;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		
		System.out.println("-----------------");
	}
	
	// Four parameterized constructor
	public Dog00(String name, String color, int cost, int age) {
		this("Dobby", "Orange", 9000);
		System.out.println("Inside Four parameterized constructor");

		this.name = name;
		this.color = color;
		this.cost = cost;
		this.age = age;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		
		System.out.println("-----------------");
	}
	
	// Five parameterized constructor
	public Dog00(String name, String color, int cost, int age, String breed) {
		this("Jimmy", "Purple", 7500, 7);
		System.out.println("Inside Five parameterized constructor");

		this.name = name; 
		this.color = color;
		this.cost = cost;
		this.age = age;
		this.breed = breed;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		
		System.out.println("-----------------");
	}
}

public class MainApp {

	public static void main(String[] args) {
		
		Dog00 d1 = new Dog00("Rocky", "White", 8000, 8, "GR");
	}

}
