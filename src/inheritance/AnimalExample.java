package inheritance;
class Animal1{
	void play() {
		System.out.println("Animal plays");
	}
	void eat() {
		System.out.println("Animal eats");
	}
	void sleep() {
		System.out.println("Animal sleeping");
	}
}
class Lion extends Animal1{
	@Override
	void eat() {
		System.out.println("Lion eats Meat");
	}
	void strong() {
		System.out.println("Lion is so strong");
	}
}
class Panda extends Animal1{
	@Override
	void eat() {
		System.out.println("Panda eats Bamboo");
	}
	void lazy() {
		System.out.println("Panda is lazy");
	}
}
class Cat extends Animal1{
	@Override
	void eat() {
		System.out.println("Cat eats fish");
	}
	void reflex() {
		System.out.println("Cat reflexes are fast");
	}
}

public class AnimalExample {

	public static void main(String[] args) {
		Lion l = new Lion();
		Panda p = new Panda();
		Cat c = new Cat();
		
		l.play();
		l.eat();
		l.sleep();
		l.strong();
		System.out.println("------------");
		
		p.play();
		p.eat();
		p.sleep();
		p.lazy();
		System.out.println("---------------");
		
		c.play();
		c.eat();
		c.sleep();
		c.reflex();
		System.out.println("---------------");
	}

}