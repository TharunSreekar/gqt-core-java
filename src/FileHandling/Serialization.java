package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException {
		Cricketer c1 = new Cricketer("Dhoni","India",240,600,10,10000);
		System.out.println(c1);
		String path = "D:\\IOPrograms\\Cricketer1.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c1);
		System.out.println("The object is stored inside the file named as :"+path);
	}

}
