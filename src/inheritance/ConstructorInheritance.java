package inheritance;

class Animal{
	public Animal() {
		super();
		System.out.println("Animal Zero parameterized Constructor ");
	}
	public Animal(String message) {
		super();
		System.out.println("Animal parameterized constructor ");
		System.out.println("The animal constructor has recieveds the message as"+message);
	}
}
class Elephant extends Animal{
	String name;
	double weight;
	public Elephant() {
		super("Hello from Elephant");
		System.out.println("Hi from elephant constructor");
	}
	public Elephant(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
		System.out.println(this.name);
		System.out.println(this.weight);
	}
}


public class ConstructorInheritance {

	public static void main(String[] args) {
		Elephant e = new Elephant();
		System.out.println("-----------------");
		Elephant e1 = new Elephant("Arjuna",5600);
	}

}
