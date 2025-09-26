package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {
	public static void main(String[] args) throws IOException{
		String path1="D:\\IOPrograms\\Input.txt";
		String path2="D:\\IOPrograms\\Output1.txt";
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			fr = new FileReader(path1);
			br = new BufferedReader(fr);
			int x;
			fw = new FileWriter(path2);
			bw = new BufferedWriter(fw);
			
			while((x=br.read())!=-1) {
				bw.write(x);
			}
		}
		finally {
			br.close();
			bw.close();
			fr.close();
			fw.close();
		}
	}
}
