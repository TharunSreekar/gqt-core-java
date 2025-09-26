package threads;

// Disadvantage of threads

class Human1 extends Thread{
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" has entered the restroom.");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is using the restroom.");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" has exited the restroom.");
			Thread.sleep(2000);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class ThreadCode7 {

	public static void main(String[] args) {
		Human1 h1 = new Human1();
		h1.setName("Man");
		Human1 h2 = new Human1();
		h2.setName("Women");
		Human1 h3 = new Human1();
		h3.setName("Others");
		
		h1.start();
		h2.start();
		h3.start();
	}

}
