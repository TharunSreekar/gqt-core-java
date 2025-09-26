package threads;

// Join

class Human2 extends Thread{
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
public class ThreadCode8 {

	public static void main(String[] args) throws InterruptedException {
		Human2 h1 = new Human2();
		h1.setName("Man");
		Human2 h2 = new Human2();
		h2.setName("Women");
		Human2 h3 = new Human2();
		h3.setName("Others");
		
//		// Join() without time limit
//		h1.start();
//		h1.join();
//		h2.start();
//		h2.join();
//		h3.start();
		
		// Join() with time limit
		h1.start();
		h1.join(5000);
		h2.start();
		h2.join(5000);
		h3.start();
	}

}
