package inheritance;
class Plane{
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
class CargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("CargoPlane flys at low heights");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry goods");
	}
}
class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("PassengerPlane flys at medium heights");
	}
	void carryHumans() {
		System.out.println("PassengerPlane carry humans");
	}
}
class FighterPlane extends Plane{
	@Override
	void fly() {
		System.out.println("FighterPlane flys at higher heights");
	}
	void carryWeapons() {
		System.out.println("FighterPlane carry weapons");
	}
}

public class InheritanceMethods {

	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carryGoods();
		System.out.println("------------");
		
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.carryHumans();
		System.out.println("---------------");
		
		fp.takeOff();
		fp.fly();
		fp.land();
		fp.carryWeapons();
		System.out.println("---------------");
	}
}
















