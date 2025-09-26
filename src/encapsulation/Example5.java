package encapsulation;

import java.util.Scanner;

// Specific Setters and Getters
// Dynamically using Scanner class.

class Dog3{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

}

public class Example5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dog3 d3 = new Dog3();
		
		System.out.println("Enter Name of the dog: ");
		d3.setName(sc.nextLine());
		System.out.println("Enter Color of the dog: ");
		d3.setColor(sc.nextLine());
		System.out.println("Enter Breed of the dog: ");
		d3.setBreed(sc.nextLine());
		System.out.println("Enter Age of the dog: ");
		d3.setAge(sc.nextInt());
		System.out.println("Enter Cost of the dog: ");
		d3.setCost(sc.nextInt());
		
		System.out.println(d3.getName());
		System.out.println(d3.getColor());
		System.out.println(d3.getBreed());
		System.out.println(d3.getAge());
		System.out.println(d3.getCost());
		
		sc.close();
	}
}
