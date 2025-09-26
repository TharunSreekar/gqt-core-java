package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path = "D:\\IOPrograms\\Cricketer1.txt";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cricketer c1 = (Cricketer)ois.readObject();
		System.out.println(c1);
	}

}
