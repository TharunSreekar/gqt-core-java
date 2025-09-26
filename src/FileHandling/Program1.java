package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program1 {
	public static void main(String[] args) throws IOException{
		String path1="D:\\IOPrograms\\File1.txt";
		String path2="D:\\IOPrograms\\File2.txt";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(path1);
			int x;
			fos = new FileOutputStream(path2);
			
			while((x=fis.read())!=-1) {
				fos.write(x);
			}
		}
		finally {
			fis.close();
			fos.close();
		}
	}
}
