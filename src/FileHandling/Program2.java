package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) throws IOException{
		String path1="D:\\IOPrograms\\File1.txt";
		String path2="D:\\IOPrograms\\File3.txt";
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(path1);
			int x;
			fw = new FileWriter(path2);
			
			while((x=fr.read())!=-1) {
				fw.write(x);
			}
		}
		finally {
			fr.close();
			fw.close();
		}
	}
}
