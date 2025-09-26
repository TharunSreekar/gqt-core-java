package polymorphism;

class Plane1{
	void takeOff() {
		System.out.println("Plane took off");
	}
	void fly() {
		System.out.println("Plane flys");
	}
	void land() {
		System.out.println("Plane lands");
	}
}

class CargoPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Carago Plane flys at low height");
	}
	void carryGoods() {
		System.out.println("Cargo Plane carry Goods");
	}
}

class PassengerPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Passenger Plane flys at medium height");
	}
	void carryHumans() {
		System.out.println("Passenger Plane carry Humans");
	}
}

class FighterPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("Fighter Plane flys at great height");
	}
	void carryWeapons() {
		System.out.println("Fighter Plane carry Weapons");
	}
}

public class PlaneExample1 {

	public static void main(String[] args) {
		CargoPlane1 cp = new CargoPlane1();
		PassengerPlane1 pp = new PassengerPlane1();
		FighterPlane1 fp = new FighterPlane1();
		
		Plane1 ref;
		
		ref = cp;
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.carryGoods();
		System.out.println("------------");
		
		ref = pp;
		ref.takeOff();
		ref.fly();
		ref.land();
		pp.carryHumans();
		System.out.println("---------------");
		
		
		ref = fp;
		ref.takeOff();
		ref.fly();
		ref.land();
		fp.carryWeapons();
		System.out.println("---------------");
	}
}
