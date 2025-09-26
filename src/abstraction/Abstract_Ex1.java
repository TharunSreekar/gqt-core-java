package abstraction;

abstract class Test{
	void land() {
		System.out.println("Plane Lands");
	}
}
abstract class Plane{
	abstract void takeOff();
	abstract void fly();
	void land() {
		System.out.println("Plane lands");
	}
}
class CargoPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("CargoPlane require a long runway to take off");
	}
	@Override
	void fly() {
		System.out.println("CargoPlanes flys at low heights");
	}
	void carryGoods() {
		System.out.println("Cargoplane carry goods");
	}
}
class PassengerPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("Passenger Plane require a medium length runway to take off");
	}
	@Override
	void fly() {
		System.out.println("PassengerPlane flys at medium heights");
	}
	void carryhumans() {
		System.out.println("PassengerPlane carry humans");
	}
}
class FighterPlane extends Plane {
	@Override
	void takeOff() {
		System.out.println("Fighter Plane require a short runway to take off");
	}
	@Override
	void fly() {
		System.out.println("FighterPlane flys at great heights");
	}
	void carryweapons() {
		System.out.println("FighterPlane carry weapons");
	}
}
class Airport{
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class Abstract_Ex1{
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		Airport ap = new Airport();
		ap.permit(cp);
		cp.carryGoods();
		System.out.println("----------");
		ap.permit(pp);
		pp.carryhumans();
		System.out.println("----------");
		ap.permit(fp);
		fp.carryweapons();
		System.out.println("----------");
		// plane p = new Plane();
		Plane p1 = new Plane() {
			@Override 
			void takeOff() {
				System.out.println("takeoff");
			}

			@Override
			void fly() {
				System.out.println("Fly");
			}
		};
		p1.takeOff();
		p1.fly();
		p1.land();
		
		Test t1 = new Test() {};
	}

}