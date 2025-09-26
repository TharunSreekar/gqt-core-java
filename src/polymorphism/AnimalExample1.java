package polymorphism;

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
class Lion1 extends Animal1{
	@Override
	void eat() {
		System.out.println("Lion eats Meat");
	}
	void strong() {
		System.out.println("Lion is so strong");
	}
}
class Panda1 extends Animal1{
	@Override
	void eat() {
		System.out.println("Panda eats Bamboo");
	}
	void lazy() {
		System.out.println("Panda is lazy");
	}
}
class Cat1 extends Animal1{
	@Override
	void eat() {
		System.out.println("Cat eats fish");
	}
	void reflex() {
		System.out.println("Cat reflexes are fast");
	}
}

public class AnimalExample1 {

	public static void main(String[] args) {
		Lion1 l = new Lion1();
		Panda1 p = new Panda1();
		Cat1 c = new Cat1();
		
		Animal1 ref;
		
		ref = l;
		ref.play();
		ref.eat();
		ref.sleep();
		l.strong();
		System.out.println("------------");
		
		ref = p;
		ref.play();
		ref.eat();
		ref.sleep();
		p.lazy();
		System.out.println("---------------");
		
		ref = c;
		ref.play();
		ref.eat();
		ref.sleep();
		c.reflex();
		System.out.println("---------------");
	}

}