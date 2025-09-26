package encapsulation;
// Specific Setters and Getters

class Dog2{
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

public class Example4 {
	public static void main(String[] args) {
		Dog2 d2 = new Dog2();
		d2.setName("Sam");
		d2.setColor("Cream");
		d2.setBreed("Husky");
		d2.setAge(3);
		d2.setCost(10000);
		
		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getBreed());
		System.out.println(d2.getAge());
		System.out.println(d2.getCost());
	}
}
