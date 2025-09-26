package polymorphism;

//Condensed

class Plane2{
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

class CargoPlane2 extends Plane2{
	@Override
	void fly() {
		System.out.println("Cargo Plane flys at low height");
	}
	void carryGoods() {
		System.out.println("Cargo Plane carry Goods");
	}
}

class PassengerPlane2 extends Plane2{
	@Override
	void fly() {
		System.out.println("Passenger Plane flys at medium height");
	}
	void carryHumans() {
		System.out.println("Passenger Plane carry Humans");
	}
}

class FighterPlane2 extends Plane2{
	@Override
	void fly() {
		System.out.println("Fighter Plane flys at great height");
	}
	void carryWeapons() {
		System.out.println("Fighter Plane carry Weapons");
	}
}

class Airport{
	void permit(Plane2 ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class PlaneExample2 {

	public static void main(String[] args) {
		CargoPlane2 cp = new CargoPlane2();
		PassengerPlane2 pp = new PassengerPlane2();
		FighterPlane2 fp = new FighterPlane2();
		Airport ap = new Airport();
		
		ap.permit(cp);
		cp.carryGoods();
		System.out.println("------------");
		
		ap.permit(pp);
		pp.carryHumans();
		System.out.println("---------------");
		
		ap.permit(fp);
		fp.carryWeapons();
		System.out.println("---------------");
	}
}
