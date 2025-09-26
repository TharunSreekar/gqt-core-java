package FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program4 {
	public static void main(String[] args) throws IOException{
		String path1="D:\\IOPrograms\\Input.txt";
		String path2="D:\\IOPrograms\\Output2.txt";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(path1);
			bis = new BufferedInputStream(fis);
			int x;
			fos = new FileOutputStream(path2);
			bos = new BufferedOutputStream(fos);
			
			while((x=bis.read())!=-1) {
				bos.write(x);
			}
		}
		finally {
			bis.close();
			bos.close();
			fis.close();
			fos.close();
		}
	}
}
