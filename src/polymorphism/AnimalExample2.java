package polymorphism;
//Condensed

class Animal2{
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
class Lion2 extends Animal2{
	@Override
	void eat() {
		System.out.println("Lion eats Meat");
	}
	void strong() {
		System.out.println("Lion is so strong");
	}
}
class Panda2 extends Animal2{
	@Override
	void eat() {
		System.out.println("Panda eats Bamboo");
	}
	void lazy() {
		System.out.println("Panda is lazy");
	}
}
class Cat2 extends Animal2{
	@Override
	void eat() {
		System.out.println("Cat eats fish");
	}
	void reflex() {
		System.out.println("Cat reflexes are fast");
	}
}

class Zoo{
	void enter(Animal2 ref) {
		ref.play();
		ref.eat();
		ref.sleep();
	}
}
public class AnimalExample2 {

	public static void main(String[] args) {
		Lion2 l = new Lion2();
		Panda2 p = new Panda2();
		Cat2 c = new Cat2();
		Zoo z = new Zoo();
		
		z.enter(l);
		l.strong();
		System.out.println("------------");
		
		z.enter(p);
		p.lazy();
		System.out.println("---------------");
		
		z.enter(c);
		c.reflex();
		System.out.println("---------------");
	}

}